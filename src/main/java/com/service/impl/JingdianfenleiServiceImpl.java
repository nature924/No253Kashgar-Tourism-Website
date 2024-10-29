package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.JingdianfenleiDao;
import com.entity.JingdianfenleiEntity;
import com.service.JingdianfenleiService;
import com.entity.vo.JingdianfenleiVO;
import com.entity.view.JingdianfenleiView;

@Service("jingdianfenleiService")
public class JingdianfenleiServiceImpl extends ServiceImpl<JingdianfenleiDao, JingdianfenleiEntity> implements JingdianfenleiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JingdianfenleiEntity> page = this.selectPage(
                new Query<JingdianfenleiEntity>(params).getPage(),
                new EntityWrapper<JingdianfenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JingdianfenleiEntity> wrapper) {
		  Page<JingdianfenleiView> page =new Query<JingdianfenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JingdianfenleiVO> selectListVO(Wrapper<JingdianfenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JingdianfenleiVO selectVO(Wrapper<JingdianfenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JingdianfenleiView> selectListView(Wrapper<JingdianfenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JingdianfenleiView selectView(Wrapper<JingdianfenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
