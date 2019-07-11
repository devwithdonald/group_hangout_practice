package com.revature.pojos;

public class BusinessMessage extends Message {
	
	private String businessSenderName;
	
	private String eventName;
	
	private Integer eventId;

	public BusinessMessage() {
		super();
	}
	
	public BusinessMessage(Integer messageId, String message, String timeOfMessage) {
		super(messageId, message, timeOfMessage);
	}

	public String getBusinessSenderName() {
		return businessSenderName;
	}

	public void setBusinessSenderName(String businessSenderName) {
		this.businessSenderName = businessSenderName;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public Integer getEventId() {
		return eventId;
	}

	public void setEventId(Integer eventId) {
		this.eventId = eventId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((businessSenderName == null) ? 0 : businessSenderName.hashCode());
		result = prime * result + ((eventId == null) ? 0 : eventId.hashCode());
		result = prime * result + ((eventName == null) ? 0 : eventName.hashCode());
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
		BusinessMessage other = (BusinessMessage) obj;
		if (businessSenderName == null) {
			if (other.businessSenderName != null)
				return false;
		} else if (!businessSenderName.equals(other.businessSenderName))
			return false;
		if (eventId == null) {
			if (other.eventId != null)
				return false;
		} else if (!eventId.equals(other.eventId))
			return false;
		if (eventName == null) {
			if (other.eventName != null)
				return false;
		} else if (!eventName.equals(other.eventName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BusinessMessage [businessSenderName=" + businessSenderName + ", eventName=" + eventName + ", eventId="
				+ eventId + "]";
	}
	
	

}
