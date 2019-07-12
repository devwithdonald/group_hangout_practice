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
	private int subscriptionId;
	
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name="USER_ID")
	private int userId;
	
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name="BUSINESS_ID")
	private int businessId;
	
	@Column(name="TIME_OF_SUB")
	private String timeOfSub;
	
	@Column(name="RSVP_COUNT")
	private int rsvpCount;
	
	public Subscription(int userId, int businessId, String timeOfSub, int rsvpCount) {
		super();
		this.userId = userId;
		this.businessId = businessId;
		this.timeOfSub = timeOfSub;
		this.rsvpCount = rsvpCount;
	}

	public Subscription() {
		super();
	}
	
	@Override
	public String toString() {
		return "Subscription [subscriptionId=" + subscriptionId + ", userId=" + userId + ", businessId=" + businessId
				+ ", timeOfSub=" + timeOfSub + ", rsvpCount=" + rsvpCount + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + businessId;
		result = prime * result + rsvpCount;
		result = prime * result + subscriptionId;
		result = prime * result + ((timeOfSub == null) ? 0 : timeOfSub.hashCode());
		result = prime * result + userId;
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
		if (businessId != other.businessId)
			return false;
		if (rsvpCount != other.rsvpCount)
			return false;
		if (subscriptionId != other.subscriptionId)
			return false;
		if (timeOfSub == null) {
			if (other.timeOfSub != null)
				return false;
		} else if (!timeOfSub.equals(other.timeOfSub))
			return false;
		if (userId != other.userId)
			return false;
		return true;
	}
	
	public int getSubscriptionId() {
		return subscriptionId;
	}
	
	public void setSubscriptionId(int subscriptionID) {
		this.subscriptionId = subscriptionID;
	}
	
	public int getUserId() {
		return userId;
	}
	
	public void setUserId(int userID) {
		this.userId = userID;
	}
	
	public int getBusinessId() {
		return businessId;
	}
	
	public void setBusinessId(int businessID) {
		this.businessId = businessID;
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
