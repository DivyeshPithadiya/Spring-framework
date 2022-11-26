package com.springDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main( String[] args ) {
    	
    	ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
    	
    	Mobile mobile = context.getBean(Mobile.class);
    	mobile.setName("Apple");
    	
    	System.out.println(mobile);
    	
    }
}
