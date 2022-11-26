package com.springDemo;

import org.springframework.stereotype.Component;

@Component("jio")
public class Jio implements Sim{

	@Override
	public String getSimName() {
		return "Jio sim";
	}
}
