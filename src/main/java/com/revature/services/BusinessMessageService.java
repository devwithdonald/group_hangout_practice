package com.revature.services;

import com.revature.pojos.BusinessMessage;

public interface BusinessMessageService {
	public void saveMessage(BusinessMessage businessMessage, int businessId);
	public void sendMessage(String message, int employeeId, int businessId);
	public BusinessMessage getBusinessMessageByBusiness(int businessId);
	

}
