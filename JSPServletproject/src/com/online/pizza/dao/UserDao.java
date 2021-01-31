package com.online.pizza.dao;

import com.online.pizza.model.User;

public interface UserDao {
	public void signup(User u);

	public boolean login(String un, String psw);

}
