package com.revature.dao;

import java.util.ArrayList;

public interface UserDao {

	public User getUserByUsername(String username, String password);

	public void addUser(User user);

	public ArrayList<User> getAllUsers();

}
