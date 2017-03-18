package com.nextu.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class OutputJson {
	
	public static String TranslateToJson(Object obj)
	{
		ObjectMapper objextMapper = new ObjectMapper();
		String result="";
		try {
			result = objextMapper.writeValueAsString(obj);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

}
