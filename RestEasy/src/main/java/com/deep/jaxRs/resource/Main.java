package com.deep.jaxRs.resource;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;


@ApplicationPath("/rest-api/v2")
public class Main extends Application {

	Set<Object> singletone= new HashSet<>();
	
	public Main(Set<Object> singletone) {

		this.singletone = singletone;
	}

	@Override
	public Set<Object> getSingletons() {
		
		return this.singletone;
	}
		
	
}
