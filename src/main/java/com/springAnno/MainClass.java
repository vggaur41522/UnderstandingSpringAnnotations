package com.springAnno;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;

import com.Job.MainInterface;
import com.config.AppConfig;
import com.config.DerivedConfig;

public class MainClass {

	@Autowired 
	static AnnotationConfigApplicationContext context;
	
	public static Set<String> currEnv = new HashSet<String>(Arrays.asList("PPP","DDD","IMP","HIVE"));
	public void ProfileProcess(String inpClass) {
		
		System.out.println("Processing starts using @Profile ");
		context = new AnnotationConfigApplicationContext();
		context.getEnvironment().setActiveProfiles(inpClass);
		context.register(AppConfig.class);
		context.refresh();
		MainInterface M1 = (MainInterface) context.getBean(MainInterface.class);
		 
		System.out.println("Implementation details : "+M1.getData());
	}
	
	public void AnnotateProce(String inpClass)
	{
		System.out.println("Processing starts using @Autowired ");
		/*
		 * For AutoWiring just remve exclusion criteria from Config : AppConfig
		 */
	}

	public boolean validationInput(String inp)
	{
		if(!MainClass.currEnv.contains(inp))
			return false;
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MainClass mn = new MainClass();

		Scanner sc = new Scanner(System.in);
		String testIp = sc.next();
		if(!mn.validationInput(testIp))
		{
			System.out.println("Validation failed !! Allowed Values are :"
					+ "\n1. PPP"
					+ "\n2. DDD"
					+ "\n3. IMP"
					+ "\n4. HIVE"
					+ "\n Exiting ... !!!");
			return ;
		}
		System.out.println("Process Started of Instance creation ....");
		mn.ProfileProcess(testIp);
		
		//mn.AnnotateProce(testIp);

	}

}
