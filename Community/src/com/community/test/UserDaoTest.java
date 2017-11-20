package com.community.test;

import com.community.dao.UserDao;
import com.community.modals.User;

public class UserDaoTest {
	private UserDao userDao = null;
	private User user = null;
	
	public UserDaoTest() {
		userDao = new UserDao();
		user = new User(0, "my@example.com", "example", "password");
		
		User u = (User) userDao.selectByName("example");
		if (u != null)
			userDao.delete(u.getId());
		userDao.add(user);
		
		userDao.delete(userDao.selectByName("example").getId());
		
		userDao.update(user);
		
		userDao.selectById(1);
		
		userDao.selectAll();
		
		userDao.selectByName("example");
	}
}
