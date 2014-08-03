package com.manpedia.web.base.entity;

import java.io.Serializable;

import org.joda.time.DateTime;

import com.manpedia.web.base.eentity.EStatus;

/**
 * 描述：基本类，定义一些通用的属性
 * @author henushang
 *
 */
public class BaseEntity implements Serializable{

	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	private String id;
	/**
	 * 创建时间
	 */
	private DateTime createtime;
	/**
	 * 更新时间
	 */
	private DateTime updatetime;
	
	private EStatus status = EStatus.enable;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public DateTime getCreatetime() {
		return createtime;
	}
	public void setCreatetime(DateTime createtime) {
		this.createtime = createtime;
	}
	public DateTime getUpdatetime() {
		return updatetime;
	}
	public void setUpdatetime(DateTime updatetime) {
		this.updatetime = updatetime;
	}
	public EStatus getStatus() {
		return status;
	}
	public void setStatus(EStatus status) {
		this.status = status;
	}
	
}
