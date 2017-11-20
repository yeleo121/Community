package com.community.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.community.modals.Modal;
import com.community.modals.User;

public class UserDao implements ModalInterface {
	private Connection con = null;
	private PreparedStatement dao = null;
	private ResultSet rs = null;

	@Override
	public boolean add(Modal modal) {
		User user = (User) modal;
		String sql = "insert into users(id,email,name,password) values(?,?,?,?)";
		con = DBHelper.getConnection();
		try {
			dao = con.prepareStatement(sql);
			dao.setInt(1, 0);
			dao.setString(2, user.getEmail());
			dao.setString(3, user.getName());
			dao.setString(4, user.getPassword());
			dao.executeUpdate();
			return true;
		} catch (SQLException e) {
			System.out.println("注册用户-错误：" + e.getMessage());
			return false;
		} finally {
			DBHelper.clear(rs, dao, con);
		}
	}

	@Override
	public boolean delete(int id) {
		String sql = "delete from users where id = ?";
		con = DBHelper.getConnection();
		try {
			dao = con.prepareStatement(sql);
			dao.setInt(1, id);
			dao.executeUpdate();
			return true;
		} catch (SQLException e) {
			System.out.println("删除用户-错误：" + e.getMessage());
			return false;
		} finally {
			DBHelper.clear(rs, dao, con);
		}
	}

	@Override
	public boolean update(Modal modal) {
		User user = (User) modal;
		String sql = "update users set name = ? where id = ?";
		con = DBHelper.getConnection();
		try {
			dao = con.prepareStatement(sql);
			dao.setString(1, user.getName());
			dao.setInt(2, user.getId());
			dao.executeUpdate();
			return true;
		} catch (SQLException e) {
			System.out.println("更新用户-错误：" + e.getMessage());
			return false;
		} finally {
			DBHelper.clear(rs, dao, con);
		}
	}

	@Override
	public Modal selectById(int id) {
		User user = null;
		String sql = "select * from users where id = ?";
		con = DBHelper.getConnection();
		try {
			dao = con.prepareStatement(sql);
			dao.setInt(1, id);
			rs = dao.executeQuery();
			while (rs.next()) {
				user = new User(id, rs.getString("email"), rs.getString("name"), rs.getString("password"));
			}
			return user;
		} catch (SQLException e) {
			System.out.println("获取单个用户-错误：" + e.getMessage());
			return null;
		} finally {
			DBHelper.clear(rs, dao, con);
		}
	}

	@Override
	public ArrayList<Modal> selectAll() {
		ArrayList<Modal> list = new ArrayList<Modal>();
		String sql = "select * from users";
		con = DBHelper.getConnection();
		try {
			dao = con.prepareStatement(sql);
			rs = dao.executeQuery();
			while (rs.next()) {
				list.add(new User(Integer.parseInt(rs.getString("id")), rs.getString("email"), rs.getString("name"), rs.getString("password")));
			}
			return list;
		} catch (SQLException e) {
			System.out.println("获取全部用户-错误：" + e.getMessage());
			return null;
		} finally {
			DBHelper.clear(rs, dao, con);
		}
	}

	public Modal selectByName(String name) {
		User user = null;
		String sql = "select * from users where name = ?";
		con = DBHelper.getConnection();
		try {
			dao = con.prepareStatement(sql);
			dao.setString(1, name);
			rs = dao.executeQuery();
			while (rs.next()) {
				user = new User(Integer.parseInt(rs.getString("id")), rs.getString("email"), rs.getString("name"), rs.getString("password"));
			}
			return user;
		} catch (SQLException e) {
			System.out.println("通过 name 查找单个用户-错误：" + e.getMessage());
			return null;
		} finally {
			DBHelper.clear(rs, dao, con);
		}
	}
}
