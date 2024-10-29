package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TesemeishiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TesemeishiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TesemeishiView;


/**
 * 特色美食
 *
 * @author 
 * @email 
 * @date 2023-03-15 11:57:16
 */
public interface TesemeishiService extends IService<TesemeishiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TesemeishiVO> selectListVO(Wrapper<TesemeishiEntity> wrapper);
   	
   	TesemeishiVO selectVO(@Param("ew") Wrapper<TesemeishiEntity> wrapper);
   	
   	List<TesemeishiView> selectListView(Wrapper<TesemeishiEntity> wrapper);
   	
   	TesemeishiView selectView(@Param("ew") Wrapper<TesemeishiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TesemeishiEntity> wrapper);
   	

}

