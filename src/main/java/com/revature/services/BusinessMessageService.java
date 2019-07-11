package com.revature.services;

import com.revature.pojos.BusinessMessage;

public interface BusinessMessageService {
	public void saveMessage(BusinessMessage bMessage, int businessId);
	public void sendMessage(String message, int EId, int BId);
	public BusinessMessage getBusinessMessageByBusiness(int BId);
	

}
