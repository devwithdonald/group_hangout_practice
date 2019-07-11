package com.revature.pojos;

public class Rsvp {
	
	private Integer rsvpId;
	
	private Integer eventId;
	
	private String username;
	
	private String eventTitle;

	public Rsvp() {
		super();
	}

	public Rsvp(Integer rsvpId, Integer eventId, String username, String eventTitle) {
		super();
		this.rsvpId = rsvpId;
		this.eventId = eventId;
		this.username = username;
		this.eventTitle = eventTitle;
	}

	public Integer getRsvpId() {
		return rsvpId;
	}

	public void setRsvpId(Integer rsvpId) {
		this.rsvpId = rsvpId;
	}

	public Integer getEventId() {
		return eventId;
	}

	public void setEventId(Integer eventId) {
		this.eventId = eventId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEventTitle() {
		return eventTitle;
	}

	public void setEventTitle(String eventTitle) {
		this.eventTitle = eventTitle;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((eventId == null) ? 0 : eventId.hashCode());
		result = prime * result + ((eventTitle == null) ? 0 : eventTitle.hashCode());
		result = prime * result + ((rsvpId == null) ? 0 : rsvpId.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
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
		Rsvp other = (Rsvp) obj;
		if (eventId == null) {
			if (other.eventId != null)
				return false;
		} else if (!eventId.equals(other.eventId))
			return false;
		if (eventTitle == null) {
			if (other.eventTitle != null)
				return false;
		} else if (!eventTitle.equals(other.eventTitle))
			return false;
		if (rsvpId == null) {
			if (other.rsvpId != null)
				return false;
		} else if (!rsvpId.equals(other.rsvpId))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Rsvp [rsvpId=" + rsvpId + ", eventId=" + eventId + ", username=" + username + ", eventTitle="
				+ eventTitle + "]";
	}
	
}
