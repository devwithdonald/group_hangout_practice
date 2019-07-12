package com.revature.dao;

import com.revature.pojos.BusinessEmployeeUser;
import com.revature.pojos.BusinessMessage;

public interface BusinessEmployeeUserDao {

	public void addBusinessEmployee(int businessId, BusinessEmployeeUser user);
	
	public BusinessEmployeeUser getEmployeeByID(int businessEmployeeId);
	
	public BusinessEmployeeUser getEmployeeByUsername(String username);
	
	public BusinessMessage getActiveMessage();
	
}
