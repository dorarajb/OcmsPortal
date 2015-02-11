package com.ocms.fm.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;
import com.ocms.course.model.Event;
import com.ocms.course.service.EventLocalServiceUtil;
import com.ocms.fm.helper.DbConnectionDriver;

public class FMDao {
	
	public List<Event> getEventList(){
		
		List<Event> eventList = null;
		try {
			eventList = EventLocalServiceUtil.getEventByFlag(1);
			System.out.println("Event:"+eventList);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return eventList;
	}
	
	public void addEvent(){
		
		List<Event> eventList = null;
		PreparedStatement stmt = null;
		
		eventList = getEventList();
		DbConnectionDriver ConDriver =new DbConnectionDriver();
		Connection fmCon = ConDriver.fmConncetion();
		for (Iterator<Event> iter = eventList.iterator(); iter.hasNext(); ) {
		    Event event = iter.next();
		    try {
		    	
				  stmt = fmCon.prepareStatement("INSERT INTO EVENT (pg_key,ev_name_t,zkc_type_event_t,zkc_location_code_t) values (?, ?, ?, ?)");
				 
				  stmt.setInt(1, (int) event.getEventId());
				  stmt.setString(2, event.getEventName());
				  stmt.setString(3, event.getCourseCode());
				  stmt.setString(4, event.getLocationCode());
				  stmt.executeUpdate();
				  
				
				}catch (SQLException e) {
				e.printStackTrace();
			}
		    
		    event = EventLocalServiceUtil.updateEventFlag(event,0);
		    
		}
	 if (stmt != null) {
	        try {
	        	stmt.close();
	        } catch (SQLException e) { /* ignored */}
	    }
	    if (fmCon != null) {
	        try {
	        	fmCon.close();
	        } catch (SQLException e) { /* ignored */}
	    }
		    
	}
	
	public void updateEvent(){
		
		List<Event> eventList = null;
		PreparedStatement stmt = null;
		
		eventList = getEventList();
		DbConnectionDriver ConDriver =new DbConnectionDriver();
		Connection fmCon = ConDriver.fmConncetion();
		for (Iterator<Event> iter = eventList.iterator(); iter.hasNext(); ) {
		    Event event = iter.next();
		    try {
		    	
				  stmt = fmCon.prepareStatement("UPDATE EVENT SET ev_name_t=?,zkc_type_event_t=?,zkc_location_code_t=? WHERE pg_key=?");
				 
				  stmt.setString(1, event.getEventName());
				  stmt.setString(2, event.getCourseCode());
				  stmt.setString(3, event.getLocationCode());
				  stmt.setInt(4, (int) event.getEventId());
				  stmt.executeUpdate();
				  
				
				}catch (SQLException e) {
				e.printStackTrace();
			}
		    
		    event = EventLocalServiceUtil.updateEventFlag(event,0);
		    
		}
	 if (stmt != null) {
	        try {
	        	stmt.close();
	        } catch (SQLException e) { /* ignored */}
	    }
	    if (fmCon != null) {
	        try {
	        	fmCon.close();
	        } catch (SQLException e) { /* ignored */}
	    }
		
	}

}
													