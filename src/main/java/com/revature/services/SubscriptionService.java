package com.revature.services;

import java.util.List;

import com.revature.pojos.BasicUser;
import com.revature.pojos.BusinessUser;
import com.revature.pojos.Subscription;

public interface SubscriptionService {
	
	public void addSubscription(Subscription sub);
	public void deleteSubscription(Subscription sub);
	public List<Subscription>getSubscriptionsByUser(BasicUser user);
	public List<Subscription>getSubscriptionsByBusiness(BusinessUser buser);
	

}
