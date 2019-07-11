package com.revature.services;

import com.revature.pojos.Event;

public interface EventService {

	public Event addBasicUserEvent(Event event);
	
	public Event addBusinessPublicEvent(Event event);
	
	public Event addBusinessPrivateEvent(Event event);
	
	public Boolean updateEvent(Event event);
	
	public Boolean removeEvent(Event event);
	
	public Boolean sendEventNotificationOut(Event event);
	
	//TODO finish this service
	
}
