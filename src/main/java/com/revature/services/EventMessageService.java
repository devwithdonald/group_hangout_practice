package com.revature.services;

import com.revature.pojos.EventMessage;

public interface EventMessageService {
	public void saveEMessage(EventMessage eMessage, int SenderID, String time_stamp);
	public void sendEMessage(EventMessage eMessage, String senderName);
}