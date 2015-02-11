package com.ocms.fm.helper;

import com.ocms.fm.service.FMService;
import com.ocms.fm.service.FMServiceImpl;

public class Validate {
	public static void main(String[ ] args)
	{
		FMService fmService = new FMServiceImpl();
		fmService.addEvent();
	}
}
