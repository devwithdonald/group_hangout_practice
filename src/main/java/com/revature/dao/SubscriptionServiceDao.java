package com.revature.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.revature.pojos.BasicUser;
import com.revature.pojos.BusinessUser;
import com.revature.pojos.Subscription;

public interface SubscriptionServiceDao {
	
	public List<Subscription>getSubscriptionsByUser(BasicUser user) throws SQLException;
	
	public List<Subscription>getSubscriptionsByBusiness(BusinessUser buser) throws SQLException;
	
	public void addSubscription(Subscription sub) throws SQLException;
	public void deleteSubscription(Subscription sub) throws SQLException;

}
