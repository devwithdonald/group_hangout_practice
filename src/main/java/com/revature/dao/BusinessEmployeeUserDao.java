package com.revature.dao;

import java.sql.SQLException;

import com.revature.pojos.BusinessEmployeeUser;
import com.revature.pojos.BusinessMessage;

public interface BusinessEmployeeUserDao {

	public void addBusinessEmployee(int Business, BusinessEmployeeUser user) throws SQLException;
	
	public BusinessEmployeeUser getEmployeeByID(int Id) throws SQLException;
	
	public BusinessEmployeeUser getEmployeeByUsername(String username) throws SQLException;
	
	public BusinessMessage getActiveMessage() throws SQLException;
	
}
