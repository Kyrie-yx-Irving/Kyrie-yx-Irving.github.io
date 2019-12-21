package com.kedacom.svms.synms.controller;


import com.kedacom.svms.synms.entity.PrisonerEntity;
import com.kedacom.svms.synms.service.PrisonerService;
import com.kedacom.svms.yky.entity.TbxyrinfoEntity;
import com.kedacom.svms.yky.service.TbxyrinfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(description = "同步数据库api", tags = "同步数据库")
public class SynController {

    @Autowired
    private PrisonerService prisonerService;

    @Autowired
    private TbxyrinfoService tbxyrinfoService;


    @GetMapping("/prisonerList")
    @ApiOperation("查询所有人员")
    public List<PrisonerEntity> findAllPrisoner() {
        return prisonerService.findAll();
    }


    @GetMapping("/infoList")
    @ApiOperation("查询同步前的人员信息列表")
    public List<TbxyrinfoEntity> findAllInfo() {
        return tbxyrinfoService.findAll();
    }

    @GetMapping("/autoIncrementOfPrisoner")
    @ApiOperation("查询人员信息的自动增量")
    public Integer selectIncrementOfPrisoner() {
        return prisonerService.selectAutoIncrement();
    }

    @GetMapping("/autoIncrementOfInfo")
    @ApiOperation("查询信息的自动增量")
    public Integer selectIncrementOfInfo() {
        return tbxyrinfoService.selectIncrement();
    }

    @GetMapping("/test")
    @ApiOperation("test")
    public PrisonerEntity save() {
        return prisonerService.save(new PrisonerEntity());
    }

}
