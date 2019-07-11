package com.revature.services;

import java.util.List;

import com.revature.pojos.BusinessUser;
import com.revature.pojos.Event;
import com.revature.pojos.Rsvp;
import com.revature.pojos.User;

public interface RsvpService {
	
	public boolean addRsvp(Rsvp rsvp);
	
	public boolean deleteRsvp(Rsvp rsvp);
	
	public List<Rsvp> getAllRsvps();
	
	public List<Rsvp> getAllRsvpsByEvent(Event event);
	
	public List<Rsvp> getAllRsvpsByUser(User user);
	
	public List<Rsvp> getAllUserRsvpsByBusiness(BusinessUser businessUser);

}
