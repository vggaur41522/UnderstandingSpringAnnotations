package com.service;

import org.springframework.stereotype.Component;

@Component
public class ServiceClass {
	
	public String getSeerviceName()
	{
		System.out.print("SERVICE IMPL");
		return "SERVICE CALL MADE";
	}
}
