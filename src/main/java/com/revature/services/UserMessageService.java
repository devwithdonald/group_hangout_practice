package com.revature.services;

import java.util.List;

import com.revature.pojos.UserMessage;

public interface UserMessageService {
	public void saveMessage(UserMessage uMessage, int senderId, int recieverId);
	public void sendMessage(UserMessage uMessage, int recieverId);
	public List<UserMessage> getAllMessageByUsername(String username);

}
