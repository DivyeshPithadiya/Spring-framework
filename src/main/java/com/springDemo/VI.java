package com.springDemo;

import org.springframework.stereotype.Component;

@Component("vi")
public class VI implements Sim {

	@Override
	public String getSimName() {
		return "VI Sim";
	}

}
