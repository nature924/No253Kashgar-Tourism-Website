package com.entity.model;

import com.entity.LvyoujingdianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 旅游景点
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-03-15 11:57:16
 */
public class LvyoujingdianModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 景点图片
	 */
	
	private String jingdiantupian;
		
	/**
	 * 景点分类
	 */
	
	private String jingdianfenlei;
		
	/**
	 * 景点等级
	 */
	
	private String jingdiandengji;
		
	/**
	 * 景点地址
	 */
	
	private String jingdiandizhi;
		
	/**
	 * 开放时间
	 */
	
	private String kaifangshijian;
		
	/**
	 * 旅游特点
	 */
	
	private String lvyoutedian;
		
	/**
	 * 景点介绍
	 */
	
	private String jingdianjieshao;
		
	/**
	 * 旅游文化
	 */
	
	private String lvyouwenhua;
				
	
	/**
	 * 设置：景点图片
	 */
	 
	public void setJingdiantupian(String jingdiantupian) {
		this.jingdiantupian = jingdiantupian;
	}
	
	/**
	 * 获取：景点图片
	 */
	public String getJingdiantupian() {
		return jingdiantupian;
	}
				
	
	/**
	 * 设置：景点分类
	 */
	 
	public void setJingdianfenlei(String jingdianfenlei) {
		this.jingdianfenlei = jingdianfenlei;
	}
	
	/**
	 * 获取：景点分类
	 */
	public String getJingdianfenlei() {
		return jingdianfenlei;
	}
				
	
	/**
	 * 设置：景点等级
	 */
	 
	public void setJingdiandengji(String jingdiandengji) {
		this.jingdiandengji = jingdiandengji;
	}
	
	/**
	 * 获取：景点等级
	 */
	public String getJingdiandengji() {
		return jingdiandengji;
	}
				
	
	/**
	 * 设置：景点地址
	 */
	 
	public void setJingdiandizhi(String jingdiandizhi) {
		this.jingdiandizhi = jingdiandizhi;
	}
	
	/**
	 * 获取：景点地址
	 */
	public String getJingdiandizhi() {
		return jingdiandizhi;
	}
				
	
	/**
	 * 设置：开放时间
	 */
	 
	public void setKaifangshijian(String kaifangshijian) {
		this.kaifangshijian = kaifangshijian;
	}
	
	/**
	 * 获取：开放时间
	 */
	public String getKaifangshijian() {
		return kaifangshijian;
	}
				
	
	/**
	 * 设置：旅游特点
	 */
	 
	public void setLvyoutedian(String lvyoutedian) {
		this.lvyoutedian = lvyoutedian;
	}
	
	/**
	 * 获取：旅游特点
	 */
	public String getLvyoutedian() {
		return lvyoutedian;
	}
				
	
	/**
	 * 设置：景点介绍
	 */
	 
	public void setJingdianjieshao(String jingdianjieshao) {
		this.jingdianjieshao = jingdianjieshao;
	}
	
	/**
	 * 获取：景点介绍
	 */
	public String getJingdianjieshao() {
		return jingdianjieshao;
	}
				
	
	/**
	 * 设置：旅游文化
	 */
	 
	public void setLvyouwenhua(String lvyouwenhua) {
		this.lvyouwenhua = lvyouwenhua;
	}
	
	/**
	 * 获取：旅游文化
	 */
	public String getLvyouwenhua() {
		return lvyouwenhua;
	}
			
}
