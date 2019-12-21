package com.kedacom.svms.synms.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @Package: com.kedacom.svms.sdms.model
 * @ClassName: SvDictItem
 * @Author: zhougaoyang
 * @Description: SvDictItem 实体类
 * @Version: 1.0
 */
@Entity(name = "svDictItem")
@Table(name = "sv_dict_item" )
@ApiModel(description = "代码详情列表")
public class SvDictItem implements Serializable{

  @Transient
  private static final long SerialVersionID = 1L;

  @Id
  @Column(name = "id")
  @ApiModelProperty(value = "主键ID")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  @Column(name = "code")
  @ApiModelProperty(value = "代码详情编号")
  private String code;
  @Column(name = "name")
  @ApiModelProperty(value = "代码详情名称")
  private String name;
  @Column(name = "type_code")
  @ApiModelProperty(value = "代码编号")
  private String typeCode;
  @Column(name = "description")
  @ApiModelProperty(value = "代码详情描述")
  private String description;
  @Column(name = "parent_id")
  @ApiModelProperty(value = "父级id")
  private Integer parentId;

  public Integer getParentId() {
    return parentId;
  }

  public void setParentId(Integer parentId) {
    this.parentId = parentId;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getTypeCode() {
    return typeCode;
  }

  public void setTypeCode(String typeCode) {
    this.typeCode = typeCode;
  }


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public String toString() {
    return "SvDictItem{" +
            "id=" + id +
            ", code='" + code + '\'' +
            ", name='" + name + '\'' +
            ", typeCode='" + typeCode + '\'' +
            ", description='" + description + '\'' +
            '}';
  }
}
