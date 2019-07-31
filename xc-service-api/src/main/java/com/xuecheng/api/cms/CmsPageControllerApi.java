package com.xuecheng.api.cms;

import com.xuecheng.framework.domain.cms.request.QueryPageRequest;
import com.xuecheng.framework.model.response.QueryResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

/**
 * cms接口
 */
@Api(value = "cms页面管理接口",description = "cms页面管理接口，提供页面的增，删，改，查")
public interface CmsPageControllerApi {

    /**
     * 页面查询
     * @param page 页面码数
     * @param size 页面大小
     * @param queryPageRequest 查询条件
     * @return QueryResponseResult 数据格式
     */
    @ApiOperation("分页查询页面列表")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "page", value = "页码", required = true, paramType = "path", dataType = "int"),
            @ApiImplicitParam(name = "size", value = "每页查询数", required = true, paramType = "path", dataType = "int")
    })
    public QueryResponseResult findList(int page, int size, QueryPageRequest queryPageRequest);

}
