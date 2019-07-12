package com.revature.dao;

import java.util.List;

import com.revature.pojos.BasicUser;
import com.revature.pojos.BusinessUser;
import com.revature.pojos.Subscription;

public interface SubscriptionDao {
	
	public List<Subscription>getSubscriptionsByUser(BasicUser user);
	
	public List<Subscription>getSubscriptionsByBusiness(BusinessUser user);
	
	public void addSubscription(Subscription sub);
	
	public void deleteSubscription(Subscription sub);

}
