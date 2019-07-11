package com.revature.dao;

import java.util.ArrayList;

import com.revature.pojos.Event;

public interface EventDao {
	
	public Event getEventByEventId(Integer eventId);
	
	public ArrayList<Event> getAllEventsByEventType(String eventType);
	
	public Event addBasicUserEvent(Event event);

	public Event addBusinessPublicEvent(Event event);

	public Event addBusinessPrivateEvent(Event event);

	public Boolean updateEvent(Event event);

	public Boolean removeEvent(Event event);

	public Boolean sendEventNotificationOut(Event event);
	
	public Event viewFriendsEventsByFriendsName(String friendsName);

}
