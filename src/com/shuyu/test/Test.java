package com.shuyu.test;

import java.util.ArrayList;
import java.util.List;

import com.shuyu.dao.ClassMapper;
import com.shuyu.dao.UserMapper;
import com.shuyu.dao.impl.ClassDaoImpl;
import com.shuyu.dao.impl.DaoImpl;
import com.shuyu.entity.ClassBean;
import com.shuyu.entity.UserBean;
import com.shuyu.utils.GsonUtil;

public class Test {
	static UserMapper dao = new DaoImpl();
	static ClassMapper classMapper=new ClassDaoImpl();

	public static void main(String[] args) {
//		testCache();
//		testOneToOne();
		testOneToMany();
	}

	static void testInsert() {
		UserBean userBean = new UserBean();
		userBean.setUserName("≤‚ ‘5");
		userBean.setPassWord("123456");
		userBean.setId(5);
		int insertUser = 0;
		try {
			insertUser = dao.insertUser(userBean);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(insertUser);
	}

	static void testCache() {
		UserBean userBean = new UserBean();
		userBean.setUserName("≤‚ ‘5");
		userBean.setPassWord("123456");
		userBean.setId(5);
		for (int i = 0; i < 5; i++) {
			List<UserBean> list = new ArrayList<>();
			if (i == 3) {
				try {
					dao.updateUser(userBean);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			try {
				// list= dao.selectAllUser();
				UserBean selectUserById = dao.selectUserById(5);

				System.out.println(selectUserById);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}

	static void testOneToOne() {

		try {
			List<UserBean> selectOneToOne = dao.selectOneToOne(1);
			System.out.println(GsonUtil.GsonString(selectOneToOne));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static void testOneToMany(){
		try {
			List<ClassBean> selectClass = classMapper.selectClass(1);
			System.out.println(GsonUtil.GsonString(selectClass));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
