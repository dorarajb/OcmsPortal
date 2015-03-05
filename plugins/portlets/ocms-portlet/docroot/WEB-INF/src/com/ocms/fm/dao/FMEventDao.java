package com.ocms.fm.dao;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import org.json.JSONObject;


public class FMEventDao {
	
	public void insertEvents(JSONObject data, String layoutName){
		
		 URL conUrl;
		 String credentials = "adminP:ctiuser";
		
		 
		try {
			URL url = new URL("http://" + credentials + "@169.254.139.71/RESTfm/CTI_REG_web/layout/"+layoutName);
			conUrl = new URL("http://169.254.139.71/RESTfm/code/RESTfmCRUDDemo/RESTfmCRUDDemo.php?&"+"data="+data+"&"+"conUrl="+url);
	        URLConnection yc = conUrl.openConnection();
	        BufferedReader in = new BufferedReader(
	                                new InputStreamReader(
	                                yc.getInputStream()));
	        /*String inputLine;

	        while ((inputLine = in.readLine()) != null) 
	            System.out.println(inputLine);*/
	        in.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    }
}
