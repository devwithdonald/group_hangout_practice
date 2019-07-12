package com.revature.pojos;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="SUBSCRIPTION")
public class Subscription {
	
	@Id
	@Column(name="SUBSCRIPTION_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int subscriptionID;
	
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name="USER_ID")
	private int userID;
	
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name="BUSINESS_ID")
	private int businessID;
	
	@Column(name="TIME_OF_SUB")
	private String timeOfSub;
	
	@Column(name="RSVP_COUNT")
	private int rsvpCount;
	
	public Subscription(int userID, int businessID, String timeOfSub, int rsvpCount) {
		super();
		this.userID = userID;
		this.businessID = businessID;
		this.timeOfSub = timeOfSub;
		this.rsvpCount = rsvpCount;
	}

	public Subscription() {
		super();
	}
	
	@Override
	public String toString() {
		return "Subscription [subscriptionID=" + subscriptionID + ", userID=" + userID + ", businessID=" + businessID
				+ ", timeOfSub=" + timeOfSub + ", rsvpCount=" + rsvpCount + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + businessID;
		result = prime * result + rsvpCount;
		result = prime * result + subscriptionID;
		result = prime * result + ((timeOfSub == null) ? 0 : timeOfSub.hashCode());
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
		if (timeOfSub == null) {
			if (other.timeOfSub != null)
				return false;
		} else if (!timeOfSub.equals(other.timeOfSub))
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
	
	public String getTimeOfSub() {
		return timeOfSub;
	}
	
	public void setTimeOfSub(String timeStamp) {
		this.timeOfSub = timeStamp;
	}
	
	public int getRsvpCount() {
		return rsvpCount;
	}
	
	public void setRsvpCount(int rsvpCount) {
		this.rsvpCount = rsvpCount;
	}

}
