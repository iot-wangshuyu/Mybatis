package com.shuyu.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.shuyu.dao.ClassMapper;
import com.shuyu.entity.ClassBean;
import com.shuyu.utils.MybatisUtil;

public class ClassDaoImpl implements ClassMapper{

	@Override
	public List<ClassBean> selectClass(int id) throws Exception {
		List<ClassBean> list=new ArrayList<>();
		SqlSession session=MybatisUtil.getSqlSession();
		try {
			ClassMapper mapper = session.getMapper(ClassMapper.class);
			list= mapper.selectClass(1);
			session.commit();
		} catch (Exception e) {
			session.rollback();
		}finally {
			MybatisUtil.closeSqlSession();
		}
		return list;
	}

}
