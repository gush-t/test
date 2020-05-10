package com.gushaohua.study;

import java.io.Serializable;
import java.util.Date;

/**
 * 基础类
 * @author gushaohua
 * @createTime 2020年4月15日
 */
public class BaseEntity implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 自增字段
	 */
	private Integer Id;
	
	private String createUser;
	
	private String modifyUser;
	
	private Date createTime;
	
	private Date modifyTime;

	
	/**
	 * 还可以进行重写equals和hashcode的method
	 */
	
	/**
	 * @return the id
	 */
	public Integer getId() {
		return Id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		Id = id;
	}

	/**
	 * @return the createUser
	 */
	public String getCreateUser() {
		return createUser;
	}

	/**
	 * @param createUser the createUser to set
	 */
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	/**
	 * @return the modifyUser
	 */
	public String getModifyUser() {
		return modifyUser;
	}

	/**
	 * @param modifyUser the modifyUser to set
	 */
	public void setModifyUser(String modifyUser) {
		this.modifyUser = modifyUser;
	}

	/**
	 * @return the createTime
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * @param createTime the createTime to set
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * @return the modifyTime
	 */
	public Date getModifyTime() {
		return modifyTime;
	}

	/**
	 * @param modifyTime the modifyTime to set
	 */
	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	@Override
	public String toString() {
		return "BaseEntiy [Id=" + Id + ", createUser=" + createUser + ", modifyUser=" + modifyUser + ", createTime="
				+ createTime + ", modifyTime=" + modifyTime + "]";
	}
	
	
	

}
