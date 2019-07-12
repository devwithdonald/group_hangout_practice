package com.revature.dao;

import java.util.List;

import com.revature.pojos.BasicUser;
import com.revature.pojos.BusinessUser;
import com.revature.pojos.Subscriptions;

public interface SubscriptionDao {
	
	public List<Subscriptions>getSubscriptionsByUser(BasicUser user);
	
	public List<Subscriptions>getSubscriptionsByBusiness(BusinessUser user);
	
	public void addSubscription(Subscriptions sub);
	
	public void deleteSubscription(Subscriptions sub);

}
