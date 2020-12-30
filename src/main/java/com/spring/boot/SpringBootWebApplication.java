package com.spring.boot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ComponentScan("com.spring.boot.application")
@ImportResource(locations = {"classpath:/spring/servicebeans.xml"})
//@ImportResource("classpath*:/spring/servicebeans.xml")
public class SpringBootWebApplication extends SpringBootServletInitializer{
	@Override
   protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
       return application.sources(SpringBootWebApplication.class);
   }

public static void main(String[] args) {
	//System.out.println("in main");
	SpringApplication.run(SpringBootWebApplication.class ,args);
	}
    
}
