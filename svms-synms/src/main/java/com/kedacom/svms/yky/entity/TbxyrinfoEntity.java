package com.kedacom.svms.yky.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "tbxyrinfo")
@ApiModel(value = "")
public class TbxyrinfoEntity {
    @Id
    @Column(name = "zid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "")
    private Integer zid;

    @Column(name = "zname")
    @ApiModelProperty(value = "姓名")
    private String zname;

    @Column(name = "zage")
    @ApiModelProperty(value = "年龄")
    private String zage;

    @Column(name = "zsex")
    @ApiModelProperty(value = "性别")
    private String zsex;

    @Column(name = "peonum")
    @ApiModelProperty(value = "人员编号")
    private String peonum;

    @Column(name = "cardnum")
    @ApiModelProperty(value = "身份证号")
    private String cardnum;

    @Column(name = "bnunit")
    @ApiModelProperty(value = "办案单位")
    private String bnunit;

    @Column(name = "sfzm")
    @ApiModelProperty(value = "案件性质/涉嫌罪名")
    private String sfzm;

    @Column(name = "homeaddress")
    @ApiModelProperty(value = "家庭住址")
    private String homeaddress;

    @Column(name = "zpic")
    @ApiModelProperty(value = "照片")
    private byte[] zpic;

    @Column(name = "zfinger")
    @ApiModelProperty(value = "指纹")
    private String zfinger;

    @Column(name = "leavetime")
    @ApiModelProperty(value = "离所时间")
    private String leavetime;

    @Column(name = "leaveadd")
    @ApiModelProperty(value = "离所地址")
    private String leaveadd;

    @Column(name = "indate")
    @ApiModelProperty(value = "入库时间")
    private String indate;

    @Column(name = "gyjs")
    @ApiModelProperty(value = "关押监室")
    private String gyjs;

    @Column(name = "bnhuanjie")
    @ApiModelProperty(value = "办案环节")
    private String bnhuanjie;

    @Column(name = "jsh")
    @ApiModelProperty(value = "监室号")
    private String jsh;

    @Column(name = "csyy")
    @ApiModelProperty(value = "出所原因")
    private String csyy;

    @Column(name = "fxdj")
    @ApiModelProperty(value = "风险等级")
    private String fxdj;

    @Column(name = "rylx")
    @ApiModelProperty(value = "人员类型")
    private String rylx;

    @Column(name = "macid")
    @ApiModelProperty(value = "")
    private String macid;

    @Column(name = "jyaq")
    @ApiModelProperty(value = "")
    private String jyaq;

    public Integer getZid() {
        return zid;
    }

    public void setZid(Integer zid) {
        this.zid = zid;
    }

    public String getZname() {
        return zname;
    }

    public void setZname(String zname) {
        this.zname = zname;
    }

    public String getZage() {
        return zage;
    }

    public void setZage(String zage) {
        this.zage = zage;
    }

    public String getZsex() {
        return zsex;
    }

    public void setZsex(String zsex) {
        this.zsex = zsex;
    }

    public String getPeonum() {
        return peonum;
    }

    public void setPeonum(String peonum) {
        this.peonum = peonum;
    }

    public String getCardnum() {
        return cardnum;
    }

    public void setCardnum(String cardnum) {
        this.cardnum = cardnum;
    }

    public String getBnunit() {
        return bnunit;
    }

    public void setBnunit(String bnunit) {
        this.bnunit = bnunit;
    }

    public String getSfzm() {
        return sfzm;
    }

    public void setSfzm(String sfzm) {
        this.sfzm = sfzm;
    }

    public String getHomeaddress() {
        return homeaddress;
    }

    public void setHomeaddress(String homeaddress) {
        this.homeaddress = homeaddress;
    }

    public byte[] getZpic() {
        return zpic;
    }

    public void setZpic(byte[] zpic) {
        this.zpic = zpic;
    }

    public String getZfinger() {
        return zfinger;
    }

    public void setZfinger(String zfinger) {
        this.zfinger = zfinger;
    }

    public String getLeavetime() {
        return leavetime;
    }

    public void setLeavetime(String leavetime) {
        this.leavetime = leavetime;
    }

    public String getLeaveadd() {
        return leaveadd;
    }

    public void setLeaveadd(String leaveadd) {
        this.leaveadd = leaveadd;
    }

    public String getIndate() {
        return indate;
    }

    public void setIndate(String indate) {
        this.indate = indate;
    }

    public String getGyjs() {
        return gyjs;
    }

    public void setGyjs(String gyjs) {
        this.gyjs = gyjs;
    }

    public String getBnhuanjie() {
        return bnhuanjie;
    }

    public void setBnhuanjie(String bnhuanjie) {
        this.bnhuanjie = bnhuanjie;
    }

    public String getJsh() {
        return jsh;
    }

    public void setJsh(String jsh) {
        this.jsh = jsh;
    }

    public String getCsyy() {
        return csyy;
    }

    public void setCsyy(String csyy) {
        this.csyy = csyy;
    }

    public String getFxdj() {
        return fxdj;
    }

    public void setFxdj(String fxdj) {
        this.fxdj = fxdj;
    }

    public String getRylx() {
        return rylx;
    }

    public void setRylx(String rylx) {
        this.rylx = rylx;
    }

    public String getMacid() {
        return macid;
    }

    public void setMacid(String macid) {
        this.macid = macid;
    }

    public String getJyaq() {
        return jyaq;
    }

    public void setJyaq(String jyaq) {
        this.jyaq = jyaq;
    }
}
