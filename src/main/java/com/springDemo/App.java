package com.springDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {
    public static void main( String[] args ) {
    	
    	ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
    	
    	Mobile mobile1 = context.getBean(Mobile.class);
    	Mobile mobile2 = context.getBean(Mobile.class);
    	
    	mobile2.setSim(context.getBean(Jio.class));
    	
    	System.out.println(mobile1);
    	System.out.println(mobile2);
    	
    	((AbstractApplicationContext) context).close();

    	
    	
    }
}
