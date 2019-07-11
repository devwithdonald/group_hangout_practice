package com.revature.services;

import com.revature.pojos.User;

public interface UserService {
	
	public User getUserByUsernameAndPassword(String username, String password);

}
