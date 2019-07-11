package com.revature.pojos;

public class Subscription {
	private int subscriptionID;
	private int userID;
	private int businessID;
	private String time_stamp;
	private int rsvp_count;
	
	public Subscription() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Subscription(int userID, int businessID, String time_stamp, int rsvp_count) {
		super();
		this.userID = userID;
		this.businessID = businessID;
		this.time_stamp = time_stamp;
		this.rsvp_count = rsvp_count;
	}
	@Override
	public String toString() {
		return "Subscription [subscriptionID=" + subscriptionID + ", userID=" + userID + ", businessID=" + businessID
				+ ", time_stamp=" + time_stamp + ", rsvp_count=" + rsvp_count + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + businessID;
		result = prime * result + rsvp_count;
		result = prime * result + subscriptionID;
		result = prime * result + ((time_stamp == null) ? 0 : time_stamp.hashCode());
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
		if (rsvp_count != other.rsvp_count)
			return false;
		if (subscriptionID != other.subscriptionID)
			return false;
		if (time_stamp == null) {
			if (other.time_stamp != null)
				return false;
		} else if (!time_stamp.equals(other.time_stamp))
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
	public String getTime_stamp() {
		return time_stamp;
	}
	public void setTime_stamp(String time_stamp) {
		this.time_stamp = time_stamp;
	}
	public int getRsvp_count() {
		return rsvp_count;
	}
	public void setRsvp_count(int rsvp_count) {
		this.rsvp_count = rsvp_count;
	}

}
