package com.revature.services;

import java.util.List;

import com.revature.pojos.BasicUser;
import com.revature.pojos.BusinessUser;
import com.revature.pojos.Subscriptions;

public interface SubscriptionService {
	
	public void addSubscription(Subscriptions subscription);
	public void deleteSubscription(Subscriptions subscription);
	public List<Subscriptions>getSubscriptionsByUser(BasicUser basicUser);
	public List<Subscriptions>getSubscriptionsByBusiness(BusinessUser businessUser);
	

}
