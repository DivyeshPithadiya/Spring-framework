package com.springDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Lazy
public class Mobile {
	
	@Value("${Mobile.name}")
	private String name;
	
	@Value("${Mobile.size}")
	private int size;
	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

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
		return "Mobile [name=" + name + ", size=" + size + ", sim=" + getSimName() + "]";
	}

	
}
