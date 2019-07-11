package com.revature.services;

import java.util.List;

import com.revature.pojos.BasicUser;
import com.revature.pojos.BusinessUser;
import com.revature.pojos.Subscription;

public interface SubscriptionService {
	
	public void addSubscription(Subscription subscription);
	public void deleteSubscription(Subscription subscription);
	public List<Subscription>getSubscriptionsByUser(BasicUser basicUser);
	public List<Subscription>getSubscriptionsByBusiness(BusinessUser businessUser);
	

}
