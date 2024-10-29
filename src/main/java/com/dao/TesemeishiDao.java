package com.dao;

import com.entity.TesemeishiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TesemeishiVO;
import com.entity.view.TesemeishiView;


/**
 * 特色美食
 * 
 * @author 
 * @email 
 * @date 2023-03-15 11:57:16
 */
public interface TesemeishiDao extends BaseMapper<TesemeishiEntity> {
	
	List<TesemeishiVO> selectListVO(@Param("ew") Wrapper<TesemeishiEntity> wrapper);
	
	TesemeishiVO selectVO(@Param("ew") Wrapper<TesemeishiEntity> wrapper);
	
	List<TesemeishiView> selectListView(@Param("ew") Wrapper<TesemeishiEntity> wrapper);

	List<TesemeishiView> selectListView(Pagination page,@Param("ew") Wrapper<TesemeishiEntity> wrapper);
	
	TesemeishiView selectView(@Param("ew") Wrapper<TesemeishiEntity> wrapper);
	

}
