package com.springDemo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("vi")
@Scope("prototype")
public class VI implements Sim {

	@Override
	public String getSimName() {
		return "VI Sim";
	}

}
