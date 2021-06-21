package com.xu.eureka.client.entity;

import java.sql.Date;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author hyacinth
 * @since 2021-06-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Nodes对象", description="")
public class Nodes implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "节点id")
    private String nid;

    @ApiModelProperty(value = "父节点id")
    private String fid;

    @ApiModelProperty(value = "节点类型f-父节点/c-子节点")
    private String tag;

    @ApiModelProperty(value = "节点类型")
    private String type;

    @ApiModelProperty(value = "节点名称")
    private String name;

    @ApiModelProperty(value = "节点描述")
    private String detail;

    @ApiModelProperty(value = "节点是否可用")
    private String useable;

    @ApiModelProperty(value = "节点是否优先显示(f否/t是)")
    private String nodeFirst;

    @ApiModelProperty(value = "节点权重(越小越显示在前)")
    private Integer nodeIndex;

    @ApiModelProperty(value = "节点创建时间")
    private Date nodeCreateDate;

    @ApiModelProperty(value = "节点修改时间")
    private Date nodeUpdateDate;


}