package com.revature.dao;

import java.util.List;

import com.revature.pojos.BusinessUser;

public interface BusinessesDao {
	
	public void addBusiness(BusinessUser businessUser);
	public BusinessUser getBusinessById(int Id);
	public List<BusinessUser> getAllBusiness();

}
