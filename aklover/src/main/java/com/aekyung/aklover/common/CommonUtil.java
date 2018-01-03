package com.aekyung.aklover.common;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

public class CommonUtil {
	
	public static void httpServletRequestPrint(HttpServletRequest request) {
		Enumeration paramNames = request.getParameterNames(); 
        while(paramNames.hasMoreElements()) { 
            String paramName = (String)paramNames.nextElement();
            String[] paramValues = request.getParameterValues(paramName);
            
            for(int i=0; i<paramValues.length; i++) {
            	if(paramValues[i].length() == 0) {
            		paramValues[i] = "";
            	}
        		System.out.println(paramName + ":" + paramValues[i]); 
            } 
        } 
	}
}
