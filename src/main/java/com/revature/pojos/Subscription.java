package com.revature.pojos;

public class Subscription {
	
	private int subscriptionID;
	
	private int userID;
	
	private int businessID;
	
	private String timeStamp;
	
	private int rsvpCount;
	
	public Subscription() {
		super();
	}
	
	public Subscription(int userID, int businessID, String timeStamp, int rsvpCount) {
		super();
		this.userID = userID;
		this.businessID = businessID;
		this.timeStamp = timeStamp;
		this.rsvpCount = rsvpCount;
	}
	
	@Override
	public String toString() {
		return "Subscription [subscriptionID=" + subscriptionID + ", userID=" + userID + ", businessID=" + businessID
				+ ", timeStamp=" + timeStamp + ", rsvpCount=" + rsvpCount + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + businessID;
		result = prime * result + rsvpCount;
		result = prime * result + subscriptionID;
		result = prime * result + ((timeStamp == null) ? 0 : timeStamp.hashCode());
		result = prime * result + userID;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Subscription other = (Subscription) obj;
		if (businessID != other.businessID)
			return false;
		if (rsvpCount != other.rsvpCount)
			return false;
		if (subscriptionID != other.subscriptionID)
			return false;
		if (timeStamp == null) {
			if (other.timeStamp != null)
				return false;
		} else if (!timeStamp.equals(other.timeStamp))
			return false;
		if (userID != other.userID)
			return false;
		return true;
	}
	
	public int getSubscriptionID() {
		return subscriptionID;
	}
	
	public void setSubscriptionID(int subscriptionID) {
		this.subscriptionID = subscriptionID;
	}
	
	public int getUserID() {
		return userID;
	}
	
	public void setUserID(int userID) {
		this.userID = userID;
	}
	
	public int getBusinessID() {
		return businessID;
	}
	
	public void setBusinessID(int businessID) {
		this.businessID = businessID;
	}
	
	public String getTimeStamp() {
		return timeStamp;
	}
	
	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}
	
	public int getRsvpCount() {
		return rsvpCount;
	}
	
	public void setRsvpCount(int rsvpCount) {
		this.rsvpCount = rsvpCount;
	}

}
