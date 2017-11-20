package com.community.test;

import com.community.dao.DBHelper;

public class DBHelperTest {
	public DBHelperTest() {
		DBHelper.getConnection();
		
		DBHelper.clear(null, null, DBHelper.getConnection());
	}
}
