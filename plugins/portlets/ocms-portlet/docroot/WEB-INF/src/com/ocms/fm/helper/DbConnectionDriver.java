package com.ocms.fm.helper;
import java.sql.*;

public class DbConnectionDriver{
	
   public Connection fmConncetion(){
      // register the JDBC client driver
	   try {
           Driver d =(Driver)Class.forName("com.filemaker.jdbc.Driver").newInstance();
           
     } catch(Exception e) {
           System.out.println(e);
     }
  // establish a connection to FileMaker
     Connection con = null;
     try {
       con = DriverManager.getConnection("jdbc:filemaker://localhost/ocmsFM","adminP", "ctiuser");
     } catch(Exception e) {
       System.out.println(e);
     }
  // get connection warnings
     SQLWarning warning = null;
     try {
        warning = con.getWarnings();
        if (warning == null) {
          System.out.println("No warnings");
        }
        while (warning != null) {
        System.out.println("Warning: "+warning);
        warning = warning.getNextWarning();
        }
      } catch (Exception e) {
        System.out.println(e);
      }
     if (warning == null) {
    	 return con;
     }else{
    	 return null; 
     }
    }
   
}