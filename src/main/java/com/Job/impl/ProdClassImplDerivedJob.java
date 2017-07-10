package com.Job.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Job.MainInterface;
import com.service.ServiceClass;

@Component
public class ProdClassImplDerivedJob implements MainInterface{

	@Autowired
	ServiceClass serviceClass;
	public String getData()
	{
		System.out.println("Coming from ******PROD- Servc Call-"+serviceClass.getSeerviceName());
		return "PROD";
	}
}
