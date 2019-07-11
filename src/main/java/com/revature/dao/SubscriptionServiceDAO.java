package com.revature.dao;

import java.sql.SQLException;
import java.util.Map;

public interface SubscriptionServiceDAO {
	
	public Map<Integer, Double>getSubscriber() throws SQLException;
	

}
