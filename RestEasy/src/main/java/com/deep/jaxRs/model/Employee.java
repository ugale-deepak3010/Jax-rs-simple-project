package com.deep.jaxRs.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employee {
	


	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee(String name) {
		super();
		this.name = name;
	}

	public Employee() {
		super();
	}

	
	
	

}
