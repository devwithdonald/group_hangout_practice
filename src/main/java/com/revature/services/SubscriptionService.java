package com.revature.services;

public interface SubscriptionService {
	
	public void addSubscription(Subscription sub);
	public void deleteSubscription(Subscription sub);
	public List<Subscription>getSubscriptionsByUser(BasicUser user);
	public List<Subscription>getSubscriptionsByBusiness(BusinessUser buser);
	

}
