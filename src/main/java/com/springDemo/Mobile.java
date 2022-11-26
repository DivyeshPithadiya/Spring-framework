package com.springDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Mobile {
	
	private String name;
	
	@Autowired
	@Qualifier("airtel")
	private Sim sim;

	public Sim getSim() {
		return sim;
	}

	public void setSim(Sim sim) {
		this.sim = sim;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getSimName() {
		return sim.getSimName();
	}

	@Override
	public String toString() {
		return "Mobile [name=" + name + ", sim=" + getSimName() + "]";
	}
	
}
