package com.ocms.fm.service;

import org.json.JSONObject;

import com.ocms.fm.dao.FMEventDao;

public class FMEventServiceImpl implements FMEventService {
	
public void addEvent(JSONObject data, String layoutName) {
		
		FMEventDao fmEventDao = new FMEventDao();
		fmEventDao.insertEvents(data, layoutName);
		
	}

}
