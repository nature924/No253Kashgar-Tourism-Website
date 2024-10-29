package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 特色美食
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-03-15 11:57:16
 */
@TableName("tesemeishi")
public class TesemeishiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public TesemeishiEntity() {
		
	}
	
	public TesemeishiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 美食名称
	 */
					
	private String meishimingcheng;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：美食名称
	 */
	public void setMeishimingcheng(String meishimingcheng) {
		this.meishimingcheng = meishimingcheng;
	}
	/**
	 * 获取：美食名称
	 */
	public String getMeishimingcheng() {
		return meishimingcheng;
	}
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
