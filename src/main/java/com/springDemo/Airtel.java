package com.springDemo;

import org.springframework.stereotype.Component;

@Component("airtel")
public class Airtel implements Sim{

	@Override
	public String getSimName() {
		return "Airtel Sim";
	}

	
}
