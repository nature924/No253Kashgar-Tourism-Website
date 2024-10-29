package com.entity.vo;

import com.entity.TesemeishiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 特色美食
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-03-15 11:57:16
 */
public class TesemeishiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 美食类型
	 */
	
	private String meishileixing;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 口味
	 */
	
	private String kouwei;
		
	/**
	 * 特色
	 */
	
	private String tese;
		
	/**
	 * 城市
	 */
	
	private String chengshi;
		
	/**
	 * 打卡地点
	 */
	
	private String dakadidian;
		
	/**
	 * 人均消费
	 */
	
	private Float renjunxiaofei;
		
	/**
	 * 详情
	 */
	
	private String xiangqing;
				
	
	/**
	 * 设置：美食类型
	 */
	 
	public void setMeishileixing(String meishileixing) {
		this.meishileixing = meishileixing;
	}
	
	/**
	 * 获取：美食类型
	 */
	public String getMeishileixing() {
		return meishileixing;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：口味
	 */
	 
	public void setKouwei(String kouwei) {
		this.kouwei = kouwei;
	}
	
	/**
	 * 获取：口味
	 */
	public String getKouwei() {
		return kouwei;
	}
				
	
	/**
	 * 设置：特色
	 */
	 
	public void setTese(String tese) {
		this.tese = tese;
	}
	
	/**
	 * 获取：特色
	 */
	public String getTese() {
		return tese;
	}
				
	
	/**
	 * 设置：城市
	 */
	 
	public void setChengshi(String chengshi) {
		this.chengshi = chengshi;
	}
	
	/**
	 * 获取：城市
	 */
	public String getChengshi() {
		return chengshi;
	}
				
	
	/**
	 * 设置：打卡地点
	 */
	 
	public void setDakadidian(String dakadidian) {
		this.dakadidian = dakadidian;
	}
	
	/**
	 * 获取：打卡地点
	 */
	public String getDakadidian() {
		return dakadidian;
	}
				
	
	/**
	 * 设置：人均消费
	 */
	 
	public void setRenjunxiaofei(Float renjunxiaofei) {
		this.renjunxiaofei = renjunxiaofei;
	}
	
	/**
	 * 获取：人均消费
	 */
	public Float getRenjunxiaofei() {
		return renjunxiaofei;
	}
				
	
	/**
	 * 设置：详情
	 */
	 
	public void setXiangqing(String xiangqing) {
		this.xiangqing = xiangqing;
	}
	
	/**
	 * 获取：详情
	 */
	public String getXiangqing() {
		return xiangqing;
	}
			
}
