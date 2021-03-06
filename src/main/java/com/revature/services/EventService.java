package com.revature.services;

import java.util.List;

import com.revature.pojos.Event;
import com.revature.pojos.User;

public interface EventService {

	public Boolean addBasicUserEvent(Event event);
	
	public Boolean addBusinessPublicEvent(Event event);
	
	public Boolean addBusinessPrivateEvent(Event event);
	
	public Boolean updateEvent(Event event);
	
	public Boolean removeEvent(Event event);
	
	public Boolean sendEventNotificationOut(Event event);
	
	public List<Event> getAllUserEvents();
	
	public Event getEventByEventId(int id);
	
	/* We will be able to check business events here also 
	 * We will need to do an 'instanceof' type check
	 * to send to the correct DAO */
	public List<Event> getAllEventsByUser(User user);
	
	public List<Event> getAllBusinessEvents();
	
	public List<Event> getAllFriendEventsByUser(User user);
	
	public List<Event> getAllSubscribedEventsByUser(User user);
	
	public List<Event> viewSummaryOfSubscribedBusinessEvents(User user);
	
}
