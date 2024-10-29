package com.dao;

import com.entity.JingdianfenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JingdianfenleiVO;
import com.entity.view.JingdianfenleiView;


/**
 * 景点分类
 * 
 * @author 
 * @email 
 * @date 2023-03-15 11:57:16
 */
public interface JingdianfenleiDao extends BaseMapper<JingdianfenleiEntity> {
	
	List<JingdianfenleiVO> selectListVO(@Param("ew") Wrapper<JingdianfenleiEntity> wrapper);
	
	JingdianfenleiVO selectVO(@Param("ew") Wrapper<JingdianfenleiEntity> wrapper);
	
	List<JingdianfenleiView> selectListView(@Param("ew") Wrapper<JingdianfenleiEntity> wrapper);

	List<JingdianfenleiView> selectListView(Pagination page,@Param("ew") Wrapper<JingdianfenleiEntity> wrapper);
	
	JingdianfenleiView selectView(@Param("ew") Wrapper<JingdianfenleiEntity> wrapper);
	

}
