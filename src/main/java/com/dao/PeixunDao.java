package com.dao;

import com.entity.PeixunEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.PeixunView;

/**
 * 培训 Dao 接口
 *
 * @author 
 * @since 2021-04-25
 */
public interface PeixunDao extends BaseMapper<PeixunEntity> {

   List<PeixunView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
