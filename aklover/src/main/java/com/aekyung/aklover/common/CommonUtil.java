package com.aekyung.aklover.common;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class CommonUtil {
	private static final Logger logger = LoggerFactory.getLogger(CommonUtil.class);
	
	public static void httpServletRequestPrint(HttpServletRequest request) {
		Enumeration<String> paramNames = request.getParameterNames(); 
        while(paramNames.hasMoreElements()) { 
            String paramName = (String)paramNames.nextElement();
            String[] paramValues = request.getParameterValues(paramName);
            
            for(int i=0; i<paramValues.length; i++) {
            	if(paramValues[i].length() == 0) {
            		paramValues[i] = "";
            	}
            	
        		logger.info(paramName + ":" + paramValues[i]); 
            } 
        } 
	}
}
