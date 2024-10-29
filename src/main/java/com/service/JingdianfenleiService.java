package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JingdianfenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JingdianfenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JingdianfenleiView;


/**
 * 景点分类
 *
 * @author 
 * @email 
 * @date 2023-03-15 11:57:16
 */
public interface JingdianfenleiService extends IService<JingdianfenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JingdianfenleiVO> selectListVO(Wrapper<JingdianfenleiEntity> wrapper);
   	
   	JingdianfenleiVO selectVO(@Param("ew") Wrapper<JingdianfenleiEntity> wrapper);
   	
   	List<JingdianfenleiView> selectListView(Wrapper<JingdianfenleiEntity> wrapper);
   	
   	JingdianfenleiView selectView(@Param("ew") Wrapper<JingdianfenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JingdianfenleiEntity> wrapper);
   	

}

