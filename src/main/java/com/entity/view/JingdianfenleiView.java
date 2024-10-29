package com.entity.view;

import com.entity.JingdianfenleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 景点分类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-15 11:57:16
 */
@TableName("jingdianfenlei")
public class JingdianfenleiView  extends JingdianfenleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JingdianfenleiView(){
	}
 
 	public JingdianfenleiView(JingdianfenleiEntity jingdianfenleiEntity){
 	try {
			BeanUtils.copyProperties(this, jingdianfenleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
