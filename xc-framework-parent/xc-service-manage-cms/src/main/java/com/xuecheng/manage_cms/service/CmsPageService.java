package com.xuecheng.manage_cms.service;

import com.xuecheng.framework.domain.cms.CmsPage;
import com.xuecheng.framework.domain.cms.request.QueryPageRequest;
import com.xuecheng.framework.model.response.CommonCode;
import com.xuecheng.framework.model.response.QueryResponseResult;
import com.xuecheng.framework.model.response.QueryResult;
import com.xuecheng.manage_cms.dao.CmsPageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

/**
 * 页面业务类
 */
@Service
public class CmsPageService {

    @Autowired
    private CmsPageRepository cmsPageRepository;

    /**
     * 页面查询分页方法
     * @param page 页码，从1开始记录
     * @param size 每页记录数 默认10
     * @param queryPageRequest 查询条件
     * @return
     */
    public QueryResponseResult findList(int page, int size, QueryPageRequest queryPageRequest) {
        //分页参数
        if(page<=0){
            page = 1;
        }
        page = page -1;
        if(size<=0){
            size = 10;
        }
        PageRequest pageRequest = PageRequest.of(page, size);
        Page<CmsPage> cmsPages = cmsPageRepository.findAll(pageRequest);
        QueryResult queryResult = new QueryResult();
        queryResult.setList(cmsPages.getContent());//数据列表
        queryResult.setTotal(cmsPages.getTotalElements());//数据总记录数
        QueryResponseResult queryResponseResult = new QueryResponseResult(CommonCode.SUCCESS,queryResult);
        return queryResponseResult;

    }


}
