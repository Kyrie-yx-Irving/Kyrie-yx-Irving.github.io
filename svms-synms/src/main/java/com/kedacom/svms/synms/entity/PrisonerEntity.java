package com.kedacom.svms.synms.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "sv_prisoner")
@ApiModel(value = "")
public class PrisonerEntity {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "主键ID")
    private Integer id;

    @Column(name = "prison_code")
    @ApiModelProperty(value = "看守所编码;GA/T300.1")
    private String prisonCode;

    @Column(name = "prisoner_code")
    @ApiModelProperty(value = "人员编码;GA/T300.3")
    private String prisonerCode;

    @Column(name = "name")
    @ApiModelProperty(value = "姓名")
    private String name;

    @Column(name = "former_name")
    @ApiModelProperty(value = "曾用名")
    private String formerName;

    @Column(name = "dormitory_code")
    @ApiModelProperty(value = "监室号;GA/T300.4")
    private String dormitoryCode;

    @Column(name = "sex")
    @ApiModelProperty(value = "性别;GB/T2261")
    private Integer sex;

    @Column(name = "birthday")
    @ApiModelProperty(value = "出生日期")
    private Date birthday;

    @Column(name = "country")
    @ApiModelProperty(value = "国籍;GB/T2659")
    private String country;

    @Column(name = "native_place")
    @ApiModelProperty(value = "籍贯;GB/T2260")
    private String nativePlace;

    @Column(name = "nation")
    @ApiModelProperty(value = "民族;GB/T3304")
    private String nation;

    @Column(name = "certificate_type")
    @ApiModelProperty(value = "证件类型;GA/T2000.156")
    private String certificateType;

    @Column(name = "certificate_code")
    @ApiModelProperty(value = "证件号码")
    private String certificateCode;

    @Column(name = "marriage")
    @ApiModelProperty(value = "婚姻状况;GB/T4766")
    private String marriage;

    @Column(name = "census_address")
    @ApiModelProperty(value = "户口所在地;GB/T2260")
    private String censusAddress;

    @Column(name = "census_detail")
    @ApiModelProperty(value = "户口所在地详细地址")
    private String censusDetail;

    @Column(name = "live_address")
    @ApiModelProperty(value = "现居住地;GB/T2260")
    private String liveAddress;

    @Column(name = "live_detail")
    @ApiModelProperty(value = "现居住地详址")
    private String liveDetail;

    @Column(name = "education")
    @ApiModelProperty(value = "文化程度;GB/T4658")
    private String education;

    @Column(name = "occupation")
    @ApiModelProperty(value = "职业;GB/T6565")
    private String occupation;

    @Column(name = "unit")
    @ApiModelProperty(value = "工作单位")
    private String unit;

    @Column(name = "identity")
    @ApiModelProperty(value = "身份;GA/T300.5")
    private String identity;

    @Column(name = "special_identity")
    @ApiModelProperty(value = "特殊身份;GA/T300.6")
    private String specialIdentity;

    @Column(name = "in_time")
    @ApiModelProperty(value = "入所时间")
    private Date inTime;

    @Column(name = "in_reason")
    @ApiModelProperty(value = "入所原因;GA/T300.7")
    private String inReason;

    @Column(name = "case_unit_type")
    @ApiModelProperty(value = "办案单位类型;GA/T300.15")
    private String caseUnitType;

    @Column(name = "case_unit")
    @ApiModelProperty(value = "办案单位")
    private String caseUnit;

    @Column(name = "lawsuit_stage")
    @ApiModelProperty(value = "诉讼阶段;GA/T300.10")
    private String lawsuitStage;

    @Column(name = "case_people")
    @ApiModelProperty(value = "办案人")
    private String casePeople;

    @Column(name = "case_telephone")
    @ApiModelProperty(value = "办案电话")
    private String caseTelephone;

    @Column(name = "turn_unit")
    @ApiModelProperty(value = "转来单位")
    private String turnUnit;

    @Column(name = "sent_unit")
    @ApiModelProperty(value = "送押单位")
    private String sentUnit;

    @Column(name = "sent_people")
    @ApiModelProperty(value = "送押人")
    private String sentPeople;

    @Column(name = "detain_evidence")
    @ApiModelProperty(value = "文书凭证类型;GA/T300.8")
    private String detainEvidence;

    @Column(name = "detain_date")
    @ApiModelProperty(value = "羁押日期")
    private Date detainDate;

    @Column(name = "deadline")
    @ApiModelProperty(value = "关押期限")
    private Date deadline;

    @Column(name = "out_where")
    @ApiModelProperty(value = "出所去向")
    private String outWhere;

    @Column(name = "out_time")
    @ApiModelProperty(value = "出所时间")
    private Date outTime;

    @Column(name = "out_reason")
    @ApiModelProperty(value = "出所原因;GA300.13")
    private String outReason;

    @Column(name = "charges")
    @ApiModelProperty(value = "涉嫌罪名")
    private String charges;

    @Column(name = "member_type")
    @ApiModelProperty(value = "成员类型;GA300.9")
    private String memberType;

    @Column(name = "people_type")
    @ApiModelProperty(value = "人员管理类别;GA/T300.11")
    private String peopleType;

    @Column(name = "politics")
    @ApiModelProperty(value = "政治面貌;GB/T4762")
    private String politics;

    @Column(name = "handle_result")
    @ApiModelProperty(value = "最终处置结果;GA240.20")
    private String handleResult;

    @Column(name = "remark")
    @ApiModelProperty(value = "备注")
    private String remark;

    @Column(name = "people_status")
    @ApiModelProperty(value = "0' COMMENT '人员状态(0在所;1出所)")
    private String peopleStatus;

    @Column(name = "accept_code")
    @ApiModelProperty(value = "收押法律文书号")
    private String acceptCode;

    @Column(name = "sent_telephone")
    @ApiModelProperty(value = "送押人电话")
    private String sentTelephone;

    @Column(name = "crime_through")
    @ApiModelProperty(value = "违法犯罪经历;GA240.16")
    private String crimeThrough;

    @Column(name = "case_brief")
    @ApiModelProperty(value = "简要案情")
    private String caseBrief;

    @Column(name = "risk_grade")
    @ApiModelProperty(value = "风险等级;GA/T300.25")
    private String riskGrade;

    @Column(name = "same_case_code")
    @ApiModelProperty(value = "同案编号")
    private String sameCaseCode;

    @Column(name = "archives_code")
    @ApiModelProperty(value = "档案编号")
    private String archivesCode;

    @Column(name = "special_case")
    @ApiModelProperty(value = "专案")
    private String specialCase;

    @Column(name = "clothes_code")
    @ApiModelProperty(value = "衣服号")
    private String clothesCode;

    @Column(name = "bed_code")
    @ApiModelProperty(value = "床位号")
    private Integer bedCode;

    @Column(name = "duty")
    @ApiModelProperty(value = "职务;GB/12403")
    private String duty;

    @Column(name = "duty_level")
    @ApiModelProperty(value = "职务级别;GB/12407")
    private String dutyLevel;

    @Column(name = "height")
    @ApiModelProperty(value = "身高")
    private Integer height;

    @Column(name = "weight")
    @ApiModelProperty(value = "体重")
    private Integer weight;

    @Column(name = "body_tag")
    @ApiModelProperty(value = "体表特殊标记")
    private String bodyTag;

    @Column(name = "foot")
    @ApiModelProperty(value = "足长")
    private Integer foot;

    @Column(name = "dispose_result_date")
    @ApiModelProperty(value = "最终处置日期")
    private Date disposeResultDate;

    @Column(name = "sentence_charge")
    @ApiModelProperty(value = "判决罪名")
    private String sentenceCharge;

    @Column(name = "sentence_start_date")
    @ApiModelProperty(value = "刑期开始日期")
    private Date sentenceStartDate;

    @Column(name = "sentence_end_date")
    @ApiModelProperty(value = "刑期结束日期")
    private Date sentenceEndDate;

    @Column(name = "sent_notice_date")
    @ApiModelProperty(value = "执行通知书送达日期")
    private Date sentNoticeDate;

    @Column(name = "sentence")
    @ApiModelProperty(value = "刑期")
    private Date sentence;

    @Column(name = "add_dispose")
    @ApiModelProperty(value = "附加处理")
    private String addDispose;

    @Column(name = "agent_people")
    @ApiModelProperty(value = "经办人")
    private String agentPeople;

    @Column(name = "agent_time")
    @ApiModelProperty(value = "经办时间")
    private Date agentTime;

    @Column(name = "test")
    @ApiModelProperty(value = "")
    private byte[] test;

    @Column(name = "whether_criminal_record")
    @ApiModelProperty(value = "是否有前科(dic)")
    private String whetherCriminalRecord;

    @Column(name = "whether_drug")
    @ApiModelProperty(value = "是否有吸毒史(dic)")
    private String whetherDrug;

    @Column(name = "expertise")
    @ApiModelProperty(value = "专长(dic)")
    private String expertise;

    @Column(name = "checked")
    @ApiModelProperty(value = "核实情况(dic)")
    private String check;

    @Column(name = "felonies")
    @ApiModelProperty(value = "重刑犯")
    private String felonies;

    @Column(name = "intern_date")
    @ApiModelProperty(value = "拘留日期")
    private Date internDate;

    @Column(name = "arrest_date")
    @ApiModelProperty(value = "逮捕日期")
    private Date arrestDate;

    @Column(name = "whether_check_tters")
    @ApiModelProperty(value = "是否委托检查信件")
    private String whetherCheckTters;

    @Column(name = "case_code")
    @ApiModelProperty(value = "案件编号")
    private String caseCode;

    @Column(name = "bring_police")
    @ApiModelProperty(value = "带入民警")
    private String bringPolice;

    @Column(name = "bring_datetime")
    @ApiModelProperty(value = "带入时间")
    private Date bringDatetime;

    @Column(name = "review_prosecution_date")
    @ApiModelProperty(value = "审查起诉日期")
    private Date reviewProsecutionDate;

    @Column(name = "in_reg_type")
    @ApiModelProperty(value = "入所登记类型")
    private String inRegType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPrisonCode() {
        return prisonCode;
    }

    public void setPrisonCode(String prisonCode) {
        this.prisonCode = prisonCode;
    }

    public String getPrisonerCode() {
        return prisonerCode;
    }

    public void setPrisonerCode(String prisonerCode) {
        this.prisonerCode = prisonerCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFormerName() {
        return formerName;
    }

    public void setFormerName(String formerName) {
        this.formerName = formerName;
    }

    public String getDormitoryCode() {
        return dormitoryCode;
    }

    public void setDormitoryCode(String dormitoryCode) {
        this.dormitoryCode = dormitoryCode;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }

    public byte[] getTest() {
        return test;
    }

    public void setTest(byte[] test) {
        this.test = test;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getCertificateType() {
        return certificateType;
    }

    public void setCertificateType(String certificateType) {
        this.certificateType = certificateType;
    }

    public String getCertificateCode() {
        return certificateCode;
    }

    public void setCertificateCode(String certificateCode) {
        this.certificateCode = certificateCode;
    }

    public String getMarriage() {
        return marriage;
    }

    public void setMarriage(String marriage) {
        this.marriage = marriage;
    }

    public String getCensusAddress() {
        return censusAddress;
    }

    public void setCensusAddress(String censusAddress) {
        this.censusAddress = censusAddress;
    }

    public String getCensusDetail() {
        return censusDetail;
    }

    public void setCensusDetail(String censusDetail) {
        this.censusDetail = censusDetail;
    }

    public String getLiveAddress() {
        return liveAddress;
    }

    public void setLiveAddress(String liveAddress) {
        this.liveAddress = liveAddress;
    }

    public String getLiveDetail() {
        return liveDetail;
    }

    public void setLiveDetail(String liveDetail) {
        this.liveDetail = liveDetail;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getSpecialIdentity() {
        return specialIdentity;
    }

    public void setSpecialIdentity(String specialIdentity) {
        this.specialIdentity = specialIdentity;
    }

    public Date getInTime() {
        return inTime;
    }

    public void setInTime(Date inTime) {
        this.inTime = inTime;
    }

    public String getInReason() {
        return inReason;
    }

    public void setInReason(String inReason) {
        this.inReason = inReason;
    }

    public String getCaseUnitType() {
        return caseUnitType;
    }

    public void setCaseUnitType(String caseUnitType) {
        this.caseUnitType = caseUnitType;
    }

    public String getCaseUnit() {
        return caseUnit;
    }

    public void setCaseUnit(String caseUnit) {
        this.caseUnit = caseUnit;
    }

    public String getLawsuitStage() {
        return lawsuitStage;
    }

    public void setLawsuitStage(String lawsuitStage) {
        this.lawsuitStage = lawsuitStage;
    }

    public String getCasePeople() {
        return casePeople;
    }

    public void setCasePeople(String casePeople) {
        this.casePeople = casePeople;
    }

    public String getCaseTelephone() {
        return caseTelephone;
    }

    public void setCaseTelephone(String caseTelephone) {
        this.caseTelephone = caseTelephone;
    }

    public String getTurnUnit() {
        return turnUnit;
    }

    public void setTurnUnit(String turnUnit) {
        this.turnUnit = turnUnit;
    }

    public String getSentUnit() {
        return sentUnit;
    }

    public void setSentUnit(String sentUnit) {
        this.sentUnit = sentUnit;
    }

    public String getSentPeople() {
        return sentPeople;
    }

    public void setSentPeople(String sentPeople) {
        this.sentPeople = sentPeople;
    }

    public String getDetainEvidence() {
        return detainEvidence;
    }

    public void setDetainEvidence(String detainEvidence) {
        this.detainEvidence = detainEvidence;
    }

    public Date getDetainDate() {
        return detainDate;
    }

    public void setDetainDate(Date detainDate) {
        this.detainDate = detainDate;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public String getOutWhere() {
        return outWhere;
    }

    public void setOutWhere(String outWhere) {
        this.outWhere = outWhere;
    }

    public Date getOutTime() {
        return outTime;
    }

    public void setOutTime(Date outTime) {
        this.outTime = outTime;
    }

    public String getOutReason() {
        return outReason;
    }

    public void setOutReason(String outReason) {
        this.outReason = outReason;
    }

    public String getCharges() {
        return charges;
    }

    public void setCharges(String charges) {
        this.charges = charges;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    public String getPeopleType() {
        return peopleType;
    }

    public void setPeopleType(String peopleType) {
        this.peopleType = peopleType;
    }

    public String getPolitics() {
        return politics;
    }

    public void setPolitics(String politics) {
        this.politics = politics;
    }

    public String getHandleResult() {
        return handleResult;
    }

    public void setHandleResult(String handleResult) {
        this.handleResult = handleResult;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getPeopleStatus() {
        return peopleStatus;
    }

    public void setPeopleStatus(String peopleStatus) {
        this.peopleStatus = peopleStatus;
    }

    public String getAcceptCode() {
        return acceptCode;
    }

    public void setAcceptCode(String acceptCode) {
        this.acceptCode = acceptCode;
    }

    public String getSentTelephone() {
        return sentTelephone;
    }

    public void setSentTelephone(String sentTelephone) {
        this.sentTelephone = sentTelephone;
    }

    public String getCrimeThrough() {
        return crimeThrough;
    }

    public void setCrimeThrough(String crimeThrough) {
        this.crimeThrough = crimeThrough;
    }

    public String getCaseBrief() {
        return caseBrief;
    }

    public void setCaseBrief(String caseBrief) {
        this.caseBrief = caseBrief;
    }

    public String getRiskGrade() {
        return riskGrade;
    }

    public void setRiskGrade(String riskGrade) {
        this.riskGrade = riskGrade;
    }

    public String getSameCaseCode() {
        return sameCaseCode;
    }

    public void setSameCaseCode(String sameCaseCode) {
        this.sameCaseCode = sameCaseCode;
    }

    public String getArchivesCode() {
        return archivesCode;
    }

    public void setArchivesCode(String archivesCode) {
        this.archivesCode = archivesCode;
    }

    public String getSpecialCase() {
        return specialCase;
    }

    public void setSpecialCase(String specialCase) {
        this.specialCase = specialCase;
    }

    public String getClothesCode() {
        return clothesCode;
    }

    public void setClothesCode(String clothesCode) {
        this.clothesCode = clothesCode;
    }

    public Integer getBedCode() {
        return bedCode;
    }

    public void setBedCode(Integer bedCode) {
        this.bedCode = bedCode;
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    public String getDutyLevel() {
        return dutyLevel;
    }

    public void setDutyLevel(String dutyLevel) {
        this.dutyLevel = dutyLevel;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getBodyTag() {
        return bodyTag;
    }

    public void setBodyTag(String bodyTag) {
        this.bodyTag = bodyTag;
    }

    public Integer getFoot() {
        return foot;
    }

    public void setFoot(Integer foot) {
        this.foot = foot;
    }

    public Date getDisposeResultDate() {
        return disposeResultDate;
    }

    public void setDisposeResultDate(Date disposeResultDate) {
        this.disposeResultDate = disposeResultDate;
    }

    public String getSentenceCharge() {
        return sentenceCharge;
    }

    public void setSentenceCharge(String sentenceCharge) {
        this.sentenceCharge = sentenceCharge;
    }

    public Date getSentenceStartDate() {
        return sentenceStartDate;
    }

    public void setSentenceStartDate(Date sentenceStartDate) {
        this.sentenceStartDate = sentenceStartDate;
    }

    public Date getSentenceEndDate() {
        return sentenceEndDate;
    }

    public void setSentenceEndDate(Date sentenceEndDate) {
        this.sentenceEndDate = sentenceEndDate;
    }

    public Date getSentNoticeDate() {
        return sentNoticeDate;
    }

    public void setSentNoticeDate(Date sentNoticeDate) {
        this.sentNoticeDate = sentNoticeDate;
    }

    public Date getSentence() {
        return sentence;
    }

    public void setSentence(Date sentence) {
        this.sentence = sentence;
    }

    public String getAddDispose() {
        return addDispose;
    }

    public void setAddDispose(String addDispose) {
        this.addDispose = addDispose;
    }

    public String getAgentPeople() {
        return agentPeople;
    }

    public void setAgentPeople(String agentPeople) {
        this.agentPeople = agentPeople;
    }

    public Date getAgentTime() {
        return agentTime;
    }

    public void setAgentTime(Date agentTime) {
        this.agentTime = agentTime;
    }


    public String getWhetherCriminalRecord() {
        return whetherCriminalRecord;
    }

    public void setWhetherCriminalRecord(String whetherCriminalRecord) {
        this.whetherCriminalRecord = whetherCriminalRecord;
    }

    public String getWhetherDrug() {
        return whetherDrug;
    }

    public void setWhetherDrug(String whetherDrug) {
        this.whetherDrug = whetherDrug;
    }

    public String getExpertise() {
        return expertise;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }

    public String getCheck() {
        return check;
    }

    public void setCheck(String check) {
        this.check = check;
    }

    public String getFelonies() {
        return felonies;
    }

    public void setFelonies(String felonies) {
        this.felonies = felonies;
    }

    public Date getInternDate() {
        return internDate;
    }

    public void setInternDate(Date internDate) {
        this.internDate = internDate;
    }

    public Date getArrestDate() {
        return arrestDate;
    }

    public void setArrestDate(Date arrestDate) {
        this.arrestDate = arrestDate;
    }

    public String getWhetherCheckTters() {
        return whetherCheckTters;
    }

    public void setWhetherCheckTters(String whetherCheckTters) {
        this.whetherCheckTters = whetherCheckTters;
    }

    public String getCaseCode() {
        return caseCode;
    }

    public void setCaseCode(String caseCode) {
        this.caseCode = caseCode;
    }

    public String getBringPolice() {
        return bringPolice;
    }

    public void setBringPolice(String bringPolice) {
        this.bringPolice = bringPolice;
    }

    public Date getBringDatetime() {
        return bringDatetime;
    }

    public void setBringDatetime(Date bringDatetime) {
        this.bringDatetime = bringDatetime;
    }

    public Date getReviewProsecutionDate() {
        return reviewProsecutionDate;
    }

    public void setReviewProsecutionDate(Date reviewProsecutionDate) {
        this.reviewProsecutionDate = reviewProsecutionDate;
    }

    public String getInRegType() {
        return inRegType;
    }

    public void setInRegType(String inRegType) {
        this.inRegType = inRegType;
    }
}
