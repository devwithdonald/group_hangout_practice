package com.revature.services;

import com.revature.pojos.BusinessMessage;

public interface BusinessMessageService {
	public void saveMessage(BusinessMessage bmess, int businessID);
	public void sendMessage(String message, int Eid, int Bid);
	public BusinessMessage getBusinessMessageByBusiness(int Bid);
	

}
