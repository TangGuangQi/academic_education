package com.xuecheng.framework.domain.cms.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class QueryPageRequest {

    //接受页面查询的查询条件
    //站点
    @ApiModelProperty(value = "站点")
    private String siteId;
    //页面ID
    @ApiModelProperty(value = "页面id")
    private String pageId;
    //页面名称
    @ApiModelProperty(value = "页面名称")
    private String pageName;
    //别名
    @ApiModelProperty(value = "页面别名")
    private String pageAliase;
    //模板id
    @ApiModelProperty(value = "模板id")
    private String templateId;
    //....

}
