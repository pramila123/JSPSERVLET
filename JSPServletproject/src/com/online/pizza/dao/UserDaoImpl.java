package com.online.pizza.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.online.pizza.DB.DB;
import com.online.pizza.model.User;

public class UserDaoImpl implements UserDao {

	@Override
	public void signup(User u) {
		String sql = "insert into user(fname,lname,username,password) values(?,?,?,?)";
		try {
			PreparedStatement ps = DB.getDb().prepareStatement(sql);
			ps.setString(1, u.getFname());
			ps.setString(2, u.getLname());
			ps.setString(3, u.getUsername());
			ps.setString(4, u.getPassword());
			ps.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public boolean login(String un, String psw) {
		String sql = "select *from user where username='" + un + "' and password='" + psw + "'";
		try {
			Statement st = DB.getDb().createStatement();
			ResultSet rs = st.executeQuery(sql);
			if (rs.next()) {
				return true;
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return false;
	}

}
