package com.revature.services;

import com.revature.pojos.BusinessEmployeeUser;
import com.revature.pojos.BusinessMessage;

public interface BusinessEmployeeUserService {
	public void addBusinessEmployee(int Business, BusinessEmployeeUser user);
	public BusinessEmployeeUser getEmployeeByID(int id);
	public BusinessEmployeeUser getEmployeeByUsername(String username);
	public BusinessMessage getActiveMessage();
	

}
