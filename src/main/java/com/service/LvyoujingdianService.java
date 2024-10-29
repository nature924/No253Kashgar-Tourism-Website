package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LvyoujingdianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LvyoujingdianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LvyoujingdianView;


/**
 * 旅游景点
 *
 * @author 
 * @email 
 * @date 2023-03-15 11:57:16
 */
public interface LvyoujingdianService extends IService<LvyoujingdianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LvyoujingdianVO> selectListVO(Wrapper<LvyoujingdianEntity> wrapper);
   	
   	LvyoujingdianVO selectVO(@Param("ew") Wrapper<LvyoujingdianEntity> wrapper);
   	
   	List<LvyoujingdianView> selectListView(Wrapper<LvyoujingdianEntity> wrapper);
   	
   	LvyoujingdianView selectView(@Param("ew") Wrapper<LvyoujingdianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LvyoujingdianEntity> wrapper);
   	

}

