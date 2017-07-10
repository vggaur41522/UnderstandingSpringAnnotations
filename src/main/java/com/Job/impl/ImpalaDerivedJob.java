package com.Job.impl;

import org.springframework.stereotype.Component;

import com.Job.MainInterface;

@Component
public class ImpalaDerivedJob implements MainInterface{
	@Override
	public String getData() {
		// TODO Auto-generated method stub
		return "Impala";
	}

}
