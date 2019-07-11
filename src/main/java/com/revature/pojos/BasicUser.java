package com.revature.pojos;

import java.util.List;

public class BasicUser extends User{
	private String firstName;
	private String lastName;
	private List<Friends> friendList;
	private List<Subscription> subscriptionList;
	
	public BasicUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BasicUser(int id, String username, String password) {
		super(id, username, password);
		// TODO Auto-generated constructor stub
	}
	
	public BasicUser(String firstName, String lastName, List<Friends> friendList,
			List<Subscription> subscriptionList) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.friendList = friendList;
		this.subscriptionList = subscriptionList;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public List<Friends> getFriendList() {
		return friendList;
	}
	public void setFriendList(List<Friends> friendList) {
		this.friendList = friendList;
	}
	public List<Subscription> getSubscriptionList() {
		return subscriptionList;
	}
	public void setSubscriptionList(List<Subscription> subscriptionList) {
		this.subscriptionList = subscriptionList;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		BasicUser other = (BasicUser) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "BasicUser [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	
	
	
}
