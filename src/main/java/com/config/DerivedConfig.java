package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.Job.MainInterface;
import com.Job.impl.DevClassImplDerivedJob;
import com.Job.impl.HiveDerivedJob;
import com.Job.impl.ImpalaDerivedJob;
import com.Job.impl.ProdClassImplDerivedJob;

@Configuration   // THis is derived Config
public class DerivedConfig {
	
	/*
	 *  Below are the implementations of MainInterfacem which need to be invoked is
	 *  sprcified by current profile active in MainClass.java 
	 */
	
	@Bean		// Aanother way of dependency injection . Similar to Auto Wiring
	@Profile("DDD")   // Current Profile
	public MainInterface dev1()
	{
		System.out.println("Inside DEV DECL");
		return new DevClassImplDerivedJob();
	}
	
	@Bean
	@Profile("PPP")
	public MainInterface prod1()
	{
		System.out.println("Inside PROD DECL");
		return new ProdClassImplDerivedJob();	
	}
	
	@Bean
	@Profile("IMP")
	public MainInterface impala()
	{
		System.out.println("Inside IMPALA DECL");
		return new ImpalaDerivedJob();
	}
	
	@Bean
	@Profile("HIVE")
	public MainInterface hive()
	{
		System.out.println("Inside HIVE DECL");
		return new HiveDerivedJob();
				
	}
}
