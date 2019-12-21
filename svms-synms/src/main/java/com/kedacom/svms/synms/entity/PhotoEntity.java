package com.kedacom.svms.synms.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "sv_photo")
@ApiModel(value = "")
public class PhotoEntity {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "主键ID")
    private Integer id;

    @Column(name = "prison_code")
    @ApiModelProperty(value = "看守所编码;GA/T300.1")
    private String prisonCode;

    @Column(name = "prisoner_code")
    @ApiModelProperty(value = "在押人员编号")
    private String prisonerCode;

    @Column(name = "code")
    @ApiModelProperty(value = "")
    private Integer code;

    @Column(name = "photo_entity")
    @ApiModelProperty(value = "照片实体")
    private byte[] photoEntity;

    @Column(name = "path")
    @ApiModelProperty(value = "照片路径")
    private String path;

    @Column(name = "photo_base64")
    @ApiModelProperty(value = "照片base64")
    private String photoBase64;

    @Column(name = "type")
    @ApiModelProperty(value = "照片序号(1:左;2:正;3:右)")
    private Integer type;

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

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public byte[] getPhotoEntity() {
        return photoEntity;
    }

    public void setPhotoEntity(byte[] photoEntity) {
        this.photoEntity = photoEntity;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getPhotoBase64() {
        return photoBase64;
    }

    public void setPhotoBase64(String photoBase64) {
        this.photoBase64 = photoBase64;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
