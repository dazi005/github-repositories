package com.giit.www.system.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.giit.www.entity.User;
import com.giit.www.system.dao.UserDao;
import com.giit.www.system.service.AccountBiz;

/**
 * Created by c0de8ug on 16-2-14.
 */
@Service
public class AccountBizImpl implements AccountBiz {
	@Resource
	UserDao userDao;

	@Override
	public User findByIdAndPassword(String username, String password) {
		return userDao.findByIdAndPassword(username, password);
	}

	@Override
	public void updatePassword(String id, String password) {
		userDao.updatePassword(id, password);
	}
}
