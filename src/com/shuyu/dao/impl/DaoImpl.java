package com.shuyu.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.shuyu.dao.UserMapper;
import com.shuyu.entity.UserBean;
import com.shuyu.utils.MybatisUtil;

public class DaoImpl implements UserMapper {

	@Override
	public int insertUser(UserBean user) throws Exception {
		int insertUser=0;
		SqlSession session=MybatisUtil.getSqlSession();
		try {
			UserMapper mapper = session.getMapper(UserMapper.class);
			insertUser = mapper.insertUser(user);
			session.commit();
		} catch (Exception e) {
			session.rollback();
		}finally {
			MybatisUtil.closeSqlSession();
		}
		return insertUser;
	}

	@Override
	public int updateUser(UserBean user) throws Exception {
		SqlSession session=MybatisUtil.getSqlSession();
		int updateUser=0;
		try {
			UserMapper mapper = session.getMapper(UserMapper.class);
			updateUser = mapper.updateUser(user);
			session.commit();
		} catch (Exception e) {
			session.rollback();
		}finally {
			MybatisUtil.closeSqlSession();
		}
		return updateUser;
	}

	@Override
	public int deleteUser(int id) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public UserBean selectUserById(int id) throws Exception {
		SqlSession session=MybatisUtil.getSqlSession();
		UserBean userBean=null;
		try {
			UserMapper mapper = session.getMapper(UserMapper.class);
			userBean = mapper.selectUserById(id);
			session.commit();
		} catch (Exception e) {
			session.rollback();
		}finally {
			MybatisUtil.closeSqlSession();
		}
		return userBean;
	}

	@Override
	public List<UserBean> selectAllUser() throws Exception {
		List<UserBean> list=new ArrayList<>();
		SqlSession session=MybatisUtil.getSqlSession();
		try {
//			list= session.selectList("UserMapper.selectAllUser", UserMapper.class);
			UserMapper mapper = session.getMapper(UserMapper.class);
			list= mapper.selectAllUser();
			session.commit();
		} catch (Exception e) {
			session.rollback();
		}finally {
			MybatisUtil.closeSqlSession();
		}
		return list;
	}

	@Override
	public List<UserBean> selectOneToOne(int id) throws Exception {
		List<UserBean> list=new ArrayList<>();
		SqlSession session=MybatisUtil.getSqlSession();
		try {
//			list= session.selectList("UserMapper.selectAllUser", UserMapper.class);
			UserMapper mapper = session.getMapper(UserMapper.class);
			list= mapper.selectOneToOne(id);
			session.commit();
		} catch (Exception e) {
			session.rollback();
		}finally {
			MybatisUtil.closeSqlSession();
		}
		return list;
	}
	
	
	

}
