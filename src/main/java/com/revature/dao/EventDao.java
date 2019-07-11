package com.revature.dao;

import java.util.ArrayList;
import java.util.List;

import com.revature.pojos.Event;
import com.revature.pojos.User;

public interface EventDao {
	
	public Event getEventByEventId(Integer eventId);
	
	public ArrayList<Event> getAllEventsByEventType(String eventType);
	
	public Boolean addBasicUserEvent(Event event);

	public Boolean addBusinessPublicEvent(Event event);

	public Boolean addBusinessPrivateEvent(Event event);

	public Boolean updateEvent(Event event);

	public Boolean removeEvent(Event event);

	public Boolean sendEventNotificationOut(Event event);
	
	public Boolean addPromotionsToEvent(Event eventId);
		
	public ArrayList<Event> getAllUserEvents();
	
	public ArrayList<Event> getAllEventsByUser(User user);
	
	public ArrayList<Event> getAllBusinessEvents();
	
	public ArrayList<Event> getAllFriendEventsByUser(User user);
	
	public ArrayList<Event> getAllSubscribedEventsByUser(User user);
	
	public ArrayList<Event> viewSummaryOfSubscribedBusinessEvents(User user);
	
}
