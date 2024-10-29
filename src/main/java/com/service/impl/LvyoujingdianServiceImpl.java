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


import com.dao.LvyoujingdianDao;
import com.entity.LvyoujingdianEntity;
import com.service.LvyoujingdianService;
import com.entity.vo.LvyoujingdianVO;
import com.entity.view.LvyoujingdianView;

@Service("lvyoujingdianService")
public class LvyoujingdianServiceImpl extends ServiceImpl<LvyoujingdianDao, LvyoujingdianEntity> implements LvyoujingdianService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LvyoujingdianEntity> page = this.selectPage(
                new Query<LvyoujingdianEntity>(params).getPage(),
                new EntityWrapper<LvyoujingdianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LvyoujingdianEntity> wrapper) {
		  Page<LvyoujingdianView> page =new Query<LvyoujingdianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LvyoujingdianVO> selectListVO(Wrapper<LvyoujingdianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LvyoujingdianVO selectVO(Wrapper<LvyoujingdianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LvyoujingdianView> selectListView(Wrapper<LvyoujingdianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LvyoujingdianView selectView(Wrapper<LvyoujingdianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
