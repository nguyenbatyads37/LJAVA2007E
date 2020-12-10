package com.t3h.demo.util;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;

@Component
public class HttpMethodConverter {
	private static Map<String, HttpMethod> httpMethods = 
			new HashMap<String, HttpMethod>();
	
	static {
		for (HttpMethod httpMethod : HttpMethod.values()) {
			httpMethods.put(httpMethod.toString(), httpMethod);
		}
	}
	
	public static HttpMethod getHttpMethod(String method) {
		return httpMethods.get(method);
	}
}
