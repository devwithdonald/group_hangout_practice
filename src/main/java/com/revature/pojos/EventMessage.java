package com.revature.pojos;

public class EventMessage extends Message {
	
	private Integer eventId;
	
	private String senderName;
	
	private String eventName;

	public EventMessage() {
		super();
	}

	public EventMessage(Integer messageId, String message, String timeOfMessage) {
		super(messageId, message, timeOfMessage);
	}

	public EventMessage(String senderName, Integer eventId, String eventName) {
		super();
		this.eventId = eventId;
		this.senderName = senderName;
		this.eventName = eventName;
	}

	public Integer getEventId() {
		return eventId;
	}

	public void setEventId(Integer eventId) {
		this.eventId = eventId;
	}

	public String getSenderName() {
		return senderName;
	}

	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((eventId == null) ? 0 : eventId.hashCode());
		result = prime * result + ((eventName == null) ? 0 : eventName.hashCode());
		result = prime * result + ((senderName == null) ? 0 : senderName.hashCode());
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
		EventMessage other = (EventMessage) obj;
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
		if (senderName == null) {
			if (other.senderName != null)
				return false;
		} else if (!senderName.equals(other.senderName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "EventMessage [eventId=" + eventId + ", senderName=" + senderName + ", eventName=" + eventName + "]";
	}
	
}
