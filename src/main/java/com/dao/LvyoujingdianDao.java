package com.dao;

import com.entity.LvyoujingdianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LvyoujingdianVO;
import com.entity.view.LvyoujingdianView;


/**
 * 旅游景点
 * 
 * @author 
 * @email 
 * @date 2023-03-15 11:57:16
 */
public interface LvyoujingdianDao extends BaseMapper<LvyoujingdianEntity> {
	
	List<LvyoujingdianVO> selectListVO(@Param("ew") Wrapper<LvyoujingdianEntity> wrapper);
	
	LvyoujingdianVO selectVO(@Param("ew") Wrapper<LvyoujingdianEntity> wrapper);
	
	List<LvyoujingdianView> selectListView(@Param("ew") Wrapper<LvyoujingdianEntity> wrapper);

	List<LvyoujingdianView> selectListView(Pagination page,@Param("ew") Wrapper<LvyoujingdianEntity> wrapper);
	
	LvyoujingdianView selectView(@Param("ew") Wrapper<LvyoujingdianEntity> wrapper);
	

}
