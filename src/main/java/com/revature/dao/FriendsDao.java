package com.revature.dao;

import java.util.List;

import com.revature.pojos.Friends;
import com.revature.pojos.User;

public interface FriendsDao {
	
	public List<Friends> getAllFriendsByUser(User user);
	
	public boolean addFriend(User user);
	
	public boolean deleteFriend(User user);

}
