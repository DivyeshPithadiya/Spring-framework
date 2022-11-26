package com.springDemo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("jio")
@Scope("prototype")
public class Jio implements Sim{

	@Override
	public String getSimName() {
		return "Jio sim";
	}
}
