package com.revature.dao;

import java.util.ArrayList;

import com.revature.pojos.User;

public interface UserDao {

	public User getUserByUsername(String username, String password);

	public Boolean addUser(User user, String userType);

	public ArrayList<User> getAllUsers();

}
