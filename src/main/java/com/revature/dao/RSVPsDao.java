package com.revature.dao;

import java.util.List;

import com.revature.pojos.BasicUser;
import com.revature.pojos.Event;
import com.revature.pojos.Rsvp;

public interface RSVPsDao {
	
	public void addRSVP(Rsvp rsvp);
	
	public Rsvp getRSVPbyUser(BasicUser user);
	
	public List<Rsvp> getAllRSVPsByEvent(Event event);
	
	public List<Rsvp> getRecentRSVPsByUser(BasicUser user);
	
}
