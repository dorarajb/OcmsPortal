package com.ocms.event;

import java.util.Iterator;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.ocms.course.model.Event;
import com.ocms.course.service.EventLocalServiceUtil;
import com.ocms.fm.service.FMService;
import com.ocms.fm.service.FMServiceImpl;

/**
 * Portlet implementation class EventPortlet
 */
public class EventPortlet extends MVCPortlet {
	public void addEvent(ActionRequest request, ActionResponse response)throws PortalException, SystemException {

		/*FMService fmService = new FMServiceImpl();
		fmService.addEvent();*/
		
		List<Event> eventList = null;
		eventList = EventLocalServiceUtil.getEventByFlag(1);
		for (Iterator<Event> iter = eventList.iterator(); iter.hasNext(); ) {
		    Event event = iter.next();
		 event = EventLocalServiceUtil.updateEventFlag(event,0);
		}
		
}
 

}
