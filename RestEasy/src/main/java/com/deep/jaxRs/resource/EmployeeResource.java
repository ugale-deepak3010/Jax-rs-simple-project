package com.deep.jaxRs.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.deep.jaxRs.model.Employee;

@Path(value = "employee")
public class EmployeeResource {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getEmployee() {
		Employee employee= new Employee("Deepak");
		
		return Response.ok(employee).build();
	}
}
