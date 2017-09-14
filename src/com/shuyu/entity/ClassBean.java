package com.shuyu.entity;

import java.io.Serializable;
import java.util.List;

public class ClassBean implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer cid;
	private String cName;
	private List<UserBean> userBeans;
	
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public List<UserBean> getUserBeans() {
		return userBeans;
	}
	public void setUserBeans(List<UserBean> userBeans) {
		this.userBeans = userBeans;
	}
	

}
