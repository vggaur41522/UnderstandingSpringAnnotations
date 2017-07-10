package com.Job.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Job.MainInterface;
import com.service.ServiceClass;

@Component
public class DevClassImplDerivedJob implements MainInterface{
	
	@Autowired
	protected ServiceClass serviceClass;
	
	public String getData()
	{
		return "DEV";
	}

}
