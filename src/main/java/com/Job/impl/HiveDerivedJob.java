package com.Job.impl;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.Job.MainInterface;

@Component
public class HiveDerivedJob implements MainInterface {

	private static final Logger LOGGER = Logger.getLogger(HiveDerivedJob.class);
	
	@Override
	public String getData() {
		// TODO Auto-generated method stub
		return "HIVE";
	}


}
