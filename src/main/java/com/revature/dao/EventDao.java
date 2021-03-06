package com.revature.dao;

import java.util.List;

import com.revature.pojos.Event;
import com.revature.pojos.User;

public interface EventDao {
	
	public Event getEventByEventId(Integer eventId);
	
	public List<Event> getAllEventsByEventType(String eventType);
	
	public Boolean addBasicUserEvent(Event event);

	public Boolean addBusinessPublicEvent(Event event);

	public Boolean addBusinessPrivateEvent(Event event);

	public Boolean updateEvent(Event event);

	public Boolean removeEvent(Event event);

	public Boolean sendEventNotificationOut(Event event);
	
	public List<Event> getAllUserEvents();
	
	public List<Event> getAllEventsByUser(User user);
	
	public List<Event> getAllBusinessEvents();
	
	public List<Event> getAllFriendEventsByUser(User user);
	
	public List<Event> getAllSubscribedEventsByUser(User user);
	
	public List<Event> viewSummaryOfSubscribedBusinessEvents(User user);
	
}
