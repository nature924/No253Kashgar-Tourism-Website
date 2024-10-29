package com.entity.model;

import com.entity.JiudianxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 酒店信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-03-15 11:57:16
 */
public class JiudianxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 类别
	 */
	
	private String leibie;
		
	/**
	 * 星级
	 */
	
	private String xingji;
		
	/**
	 * 酒店图片
	 */
	
	private String jiudiantupian;
		
	/**
	 * 酒店地址
	 */
	
	private String jiudiandizhi;
		
	/**
	 * 房间类型
	 */
	
	private String fangjianleixing;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
	/**
	 * 酒店介绍
	 */
	
	private String jiudianjieshao;
				
	
	/**
	 * 设置：类别
	 */
	 
	public void setLeibie(String leibie) {
		this.leibie = leibie;
	}
	
	/**
	 * 获取：类别
	 */
	public String getLeibie() {
		return leibie;
	}
				
	
	/**
	 * 设置：星级
	 */
	 
	public void setXingji(String xingji) {
		this.xingji = xingji;
	}
	
	/**
	 * 获取：星级
	 */
	public String getXingji() {
		return xingji;
	}
				
	
	/**
	 * 设置：酒店图片
	 */
	 
	public void setJiudiantupian(String jiudiantupian) {
		this.jiudiantupian = jiudiantupian;
	}
	
	/**
	 * 获取：酒店图片
	 */
	public String getJiudiantupian() {
		return jiudiantupian;
	}
				
	
	/**
	 * 设置：酒店地址
	 */
	 
	public void setJiudiandizhi(String jiudiandizhi) {
		this.jiudiandizhi = jiudiandizhi;
	}
	
	/**
	 * 获取：酒店地址
	 */
	public String getJiudiandizhi() {
		return jiudiandizhi;
	}
				
	
	/**
	 * 设置：房间类型
	 */
	 
	public void setFangjianleixing(String fangjianleixing) {
		this.fangjianleixing = fangjianleixing;
	}
	
	/**
	 * 获取：房间类型
	 */
	public String getFangjianleixing() {
		return fangjianleixing;
	}
				
	
	/**
	 * 设置：联系电话
	 */
	 
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
				
	
	/**
	 * 设置：酒店介绍
	 */
	 
	public void setJiudianjieshao(String jiudianjieshao) {
		this.jiudianjieshao = jiudianjieshao;
	}
	
	/**
	 * 获取：酒店介绍
	 */
	public String getJiudianjieshao() {
		return jiudianjieshao;
	}
			
}
