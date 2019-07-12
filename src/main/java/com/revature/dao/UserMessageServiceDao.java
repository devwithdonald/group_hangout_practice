package com.revature.dao;

import java.sql.SQLException;
import java.util.List;

import com.revature.pojos.UserMessage;

public interface UserMessageServiceDao {
	
	public void saveMessage(UserMessage uMessage, int senderId, int recieverId) throws SQLException;

	public void sendMessage(UserMessage uMessage, int recieverId) throws SQLException ;
	
	public List<UserMessage> getAllMessageByUsername(String username) throws SQLException;


}
