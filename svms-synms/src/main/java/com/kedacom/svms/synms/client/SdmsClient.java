package com.kedacom.svms.synms.client;


import com.kedacom.svms.synms.entity.SvDictItem;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "sdms")
public interface SdmsClient {

    @GetMapping("/sdms/sexTypes")
    @ApiOperation("查询所有的性别")
    List<SvDictItem> findAllSexType();

    @GetMapping("/sdms/getCaseUnitCodeByName")
    @ApiOperation("通过送押单位查询送押单位编码")
    String findCaseUnitCodeByName(@RequestParam("caseUnit") String caseUnit);

    @GetMapping("/sdms/caseTypes")
    @ApiOperation("查询所有案件类别")
    List<SvDictItem> findAllCharges();

    @GetMapping("/sdms/lawsuitStages")
    @ApiOperation("查询所有诉讼阶段")
    List<SvDictItem> findAllLawsuitStage();

    @GetMapping("/sdms/riskGrades")
    @ApiOperation("查询所有的风险等级")
    List<SvDictItem> findAllRiskGrade();

    @GetMapping("/sdms/getNativePlaceByName")
    @ApiOperation("查询生源所在地查询生源地编码")
    String findNativePlaceByName(@RequestParam("nativePlace") String nativePlace);

}
