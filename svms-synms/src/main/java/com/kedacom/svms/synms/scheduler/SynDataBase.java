package com.kedacom.svms.synms.scheduler;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.kedacom.svms.synms.client.FsClient;
import com.kedacom.svms.synms.client.SdmsClient;
import com.kedacom.svms.synms.dictionary.CaseTypeDictionary;
import com.kedacom.svms.synms.dictionary.LawsuitStageDictionary;
import com.kedacom.svms.synms.dictionary.RiskGradeDictionary;
import com.kedacom.svms.synms.dictionary.SexDictionary;
import com.kedacom.svms.synms.entity.PhotoEntity;
import com.kedacom.svms.synms.entity.PrisonerEntity;
import com.kedacom.svms.synms.entity.SvDictItem;
import com.kedacom.svms.synms.service.PhotoService;
import com.kedacom.svms.synms.service.PrisonerService;
import com.kedacom.svms.yky.entity.TbxyrinfoEntity;
import com.kedacom.svms.yky.service.TbxyrinfoService;
import javafx.scene.input.DataFormat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Component
public class SynDataBase {

    private Logger logger = LoggerFactory.getLogger(SynDataBase.class);

    private DateFormat format = new SimpleDateFormat("yyyy-MM-dd");

    private static String regex = "(?<province>[^省]+自治区|.*?省|.*?行政区|.*?市)" +
            "(?<city>[^市]+自治州|.*?地区|.*?行政单位|.+盟|市辖区|.*?市|.*?县)" +
            "(?<county>[^县]+县|.+区|.+市|.+旗|.+海域|.+岛)?(?<town>[^区]+区|.+镇)?(?<village>.*)";
    private static Pattern pattern = Pattern.compile(regex);

    @Autowired
    private PhotoService photoService;

    @Autowired
    private PrisonerService prisonerService;

    @Autowired
    private TbxyrinfoService tbxyrinfoService;

    @Autowired
    private CaseTypeDictionary caseTypeDictionary;

    @Autowired
    private LawsuitStageDictionary lawsuitStageDictionary;

    @Autowired
    private RiskGradeDictionary riskGradeDictionary;

    @Autowired
    private SexDictionary sexDictionary;

    @Autowired
    private SdmsClient sdmsClient;

    @Autowired
    private FsClient fsClient;



    @Scheduled(cron = "0/30 * * * * *")
    public void synDataBase() {
        logger.info("开始同步数据库");
        if (tbxyrinfoService.selectIncrement() > prisonerService.selectAutoIncrement())
            startSyn();
        logger.info("同步数据库结束");
    }

    private void startSyn() {
        List<TbxyrinfoEntity> infoNeedSynList = tbxyrinfoService.selectFromIdRange(
                prisonerService.selectAutoIncrement(), tbxyrinfoService.selectIncrement());
        for (TbxyrinfoEntity infoEntity : infoNeedSynList) {
            PrisonerEntity prisonerEntity = new PrisonerEntity();
            prisonerEntity.setName(infoEntity.getZname());
            prisonerEntity.setSex(Integer.valueOf(sexDictionary.getSexCode(infoEntity.getZsex())));
            String prisonerCode = infoEntity.getPeonum();
            prisonerEntity.setPrisonerCode(prisonerCode);
            // 没有对应的字段
            prisonerEntity.setCertificateCode(null);
            prisonerEntity.setCaseUnit(sdmsClient.findCaseUnitCodeByName(infoEntity.getBnunit()));
            prisonerEntity.setCharges(parseCaseType(infoEntity.getSfzm()));
            prisonerEntity.setCensusDetail(infoEntity.getHomeaddress());
            prisonerEntity.setInTime(parseDate(infoEntity.getIndate()));
            String prisonCode = infoEntity.getGyjs();
            prisonerEntity.setPrisonCode(prisonCode);
            prisonerEntity.setLawsuitStage(lawsuitStageDictionary.getLawsuitStageCode(infoEntity.getBnhuanjie()));
            String dormitoryCode = infoEntity.getJsh();
            prisonerEntity.setDormitoryCode(dormitoryCode);
            prisonerEntity.setRiskGrade(riskGradeDictionary.getRiskGradeCode(infoEntity.getFxdj()));
            String county = parseCountyByAddress(infoEntity.getHomeaddress());
            prisonerEntity.setNativePlace(sdmsClient.findNativePlaceByName(county));
            PhotoEntity photoEntity = new PhotoEntity();
            byte[] jpgByteArray = infoEntity.getZpic();
            photoEntity.setPhotoEntity(jpgByteArray);
            photoEntity.setPrisonCode(prisonCode);
            photoEntity.setPrisonerCode(prisonerCode);
            photoEntity.setType(2);
            JSONObject uploadResult = fsClient.uploadByteArray(jpgByteArray);
            if (uploadResult.get("msg").equals("OK"))
                photoEntity.setPath(uploadResult.getString("openUrl"));
            photoService.savePhone(photoEntity);
            prisonerService.save(prisonerEntity);

        }
    }


    private Date parseDate(String date) {
        Date result;
        try {
             result = format.parse(date);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return result;
    }


    private static String parseCountyByAddress(String address) {
        Matcher matcher = pattern.matcher(address);
        if (matcher.find()) {
            return matcher.group("county");
        }
        return "not found";

    }

    private String parseCaseType(String caseTypes) {
        List<String> caseTypeList = getCaseTypeList(caseTypes);
        if (caseTypeList.size() == 0)
            return null;
        if (caseTypeList.size() == 1)
            return caseTypeList.get(0);
        StringBuilder result = new StringBuilder(caseTypeDictionary.getCaseTypeCode(caseTypeList.get(0)));
        for (int i = 1; i < caseTypeList.size(); i++) {
            result.append(",");
            result.append(caseTypeDictionary.getCaseTypeCode(caseTypeList.get(i)));
        }
        return result.toString();

    }

    private List<String> getCaseTypeList(String caseTypes) {
        if (StringUtils.isEmpty(caseTypes))
            return new ArrayList<>();
        return Arrays.asList(caseTypes.split(","));
    }

}
