package com.shuyu.dao;

import java.util.List;

import com.shuyu.entity.UserBean;

public interface UserMapper {

	/**
	 * 新增用戶
	 * 
	 * @param user
	 * @return
	 * @throws Exception
	 */
	int insertUser(UserBean user) throws Exception;

	/**
	 * 修改用戶
	 * 
	 * @param user
	 * @param id
	 * @return
	 * @throws Exception
	 */
	int updateUser(UserBean user) throws Exception;

	/**
	 * 刪除用戶
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	int deleteUser(int id) throws Exception;

	/**
	 * 根据id查询用户信息
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	UserBean selectUserById(int id) throws Exception;

	/**
	 * 查询所有的用户信息
	 * 
	 * @return
	 * @throws Exception
	 */
	List<UserBean> selectAllUser() throws Exception;
	
	List<UserBean> selectOneToOne(int id) throws Exception;

}
