package com.ocms.fm.service;

import com.ocms.fm.dao.FMDao;

public class FMServiceImpl implements FMService {

	
	public void addEvent() {
		
		FMDao fmDao = new FMDao();
		fmDao.addEvent();
		
	}

}
