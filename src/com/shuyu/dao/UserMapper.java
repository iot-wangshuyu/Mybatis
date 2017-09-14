package com.shuyu.dao;

import java.util.List;

import com.shuyu.entity.UserBean;

public interface UserMapper {

	/**
	 * �����Ñ�
	 * 
	 * @param user
	 * @return
	 * @throws Exception
	 */
	int insertUser(UserBean user) throws Exception;

	/**
	 * �޸��Ñ�
	 * 
	 * @param user
	 * @param id
	 * @return
	 * @throws Exception
	 */
	int updateUser(UserBean user) throws Exception;

	/**
	 * �h���Ñ�
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	int deleteUser(int id) throws Exception;

	/**
	 * ����id��ѯ�û���Ϣ
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	UserBean selectUserById(int id) throws Exception;

	/**
	 * ��ѯ���е��û���Ϣ
	 * 
	 * @return
	 * @throws Exception
	 */
	List<UserBean> selectAllUser() throws Exception;
	
	List<UserBean> selectOneToOne(int id) throws Exception;

}
