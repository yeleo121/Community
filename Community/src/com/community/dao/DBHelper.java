package com.community.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBHelper {
	private static String driver = "com.mysql.jdbc.Driver";
	private static String connectionString = "jdbc:mysql://127.0.0.1:3306/community";
	private static String username = "root";
	private static String password = "123456";
    
    public static Connection getConnection() {
    	try {
	        Class.forName(driver).newInstance();
	        return DriverManager.getConnection(connectionString, username, password);
    	} catch (Exception e) {
    		System.out.println("数据库链接-错误：" + e.getMessage());
    		return null;
    	}
    }
    
    public static void clear(ResultSet resultSet, Statement statement, Connection connection) {
        try {
            if (resultSet != null) {
                resultSet.close();
            }
            
            if (statement != null) {
                statement.close();
            }
            
            if (connection != null) {
                connection.close();
            } 
        } catch (SQLException ignored) {
        	System.out.println("数据库断开链接-错误：" + ignored.getMessage());
        }
    } 
}
