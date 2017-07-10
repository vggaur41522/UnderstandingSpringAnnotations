package com.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;

@Configuration  // States that this is Config source -- same as spring.xml
@Import({DerivedConfig.class})   // Any Import of external Configs
//Package to be scanned with any exception given below
@ComponentScan(basePackages = "com.*",  
excludeFilters = @Filter(type = FilterType.ASPECTJ, pattern="com.Job.impl.*DerivedJob+"))

public class AppConfig {

}
