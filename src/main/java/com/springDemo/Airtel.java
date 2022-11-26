package com.springDemo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("airtel")
@Scope("prototype")
public class Airtel implements Sim{

	@Override
	public String getSimName() {
		return "Airtel Sim";
	}

	
}
