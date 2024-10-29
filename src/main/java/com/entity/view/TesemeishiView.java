package com.entity.view;

import com.entity.TesemeishiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 特色美食
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-15 11:57:16
 */
@TableName("tesemeishi")
public class TesemeishiView  extends TesemeishiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TesemeishiView(){
	}
 
 	public TesemeishiView(TesemeishiEntity tesemeishiEntity){
 	try {
			BeanUtils.copyProperties(this, tesemeishiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
