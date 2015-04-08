package com.ocms.fm.controller;

import java.util.Iterator;



import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.security.auth.PrincipalThreadLocal;
import com.ocms.course.model.Event;
import com.ocms.course.service.EventLocalServiceUtil;
import com.ocms.course.service.EventServiceUtil;
import com.ocms.fm.service.FMEventService;
import com.ocms.fm.service.FMEventServiceImpl;


public class FMEventController {
	
public void insertEvent(){
		
		List<Event> eventList = null;
		String layoutName = null;
		
		try {
			long userId =PrincipalThreadLocal.getUserId();
			eventList = EventServiceUtil.getEventByFlag(1);
			layoutName = "Web%20Event";
			System.out.println("Event:"+eventList);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Iterator<Event> iterator = eventList.iterator();
		while (iterator.hasNext()) {
			Event event = iterator.next();
			JSONObject data = new JSONObject();
			try {
				data.put("pg_event_id", event.getEventId());
				data.put("zkc_type_event_n",event.getCourseId());
				data.put("zkc_location_code_t",event.getLocationCode());
				data.put("zkc_type_event_t",event.getCourseCode());
				data.put("ev_name_t", event.getEventName());
				//data.put("ev_date_d",event.getStartDate());
				//data.put("ev_dateEND_dc",event.getEndDate());
				System.out.println("JSON:"+data);
				FMEventService FMEventService = new FMEventServiceImpl();
				FMEventService.addEvent(data, layoutName);
				//EventLocalServiceUtil.updateEventFlag(event,0);
				
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	 
		
	}

}
