package com.shuyu.dao;

import java.util.List;

import com.shuyu.entity.ClassBean;

public interface ClassMapper {
	
	List<ClassBean> selectClass(int id) throws Exception;

}
