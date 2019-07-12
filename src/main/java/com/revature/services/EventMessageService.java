package com.revature.services;

import com.revature.pojos.EventMessage;

public interface EventMessageService {
	public void saveEMessage(EventMessage eventMessage, int SenderId, String timeStamp);
	public void sendEMessage(EventMessage eventMessage, String senderName);
}