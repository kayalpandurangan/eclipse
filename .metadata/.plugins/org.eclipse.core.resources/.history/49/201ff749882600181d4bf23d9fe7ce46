package pack;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/demo")
public class Demorest {
	private static EmployeeService service = new EmployeeService();
	

	@Path("/simple")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String test() {
		System.out.println("test() is called");
		return "<greeting>Hello RESTFul</greeting>";
	}

	@GET
	@Path("/getCustomer")
	@Produces(MediaType.APPLICATION_XML)
	public customer sendCustomer() {
		System.out.println("sendCustomer is called");
		customer c = new customer(111, "Rahul", 34);
		return c ;
	}
	@Path("/storeCustomer")
	@POST
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.TEXT_PLAIN)
	public String recieveCustomer(customer c) {
		//call to Service or DAO classes
		System.out.println("Id = "+c.getCustomerId());
		System.out.println("Name = "+c.getCustomerName());
		System.out.println("Age = "+c.getAge());
		return "Stored Successfully";
	}
	
	@Path("/allEmployees")
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Employee> getAllEmployees() {
		System.out.println("Recieved");
		return service.displayAll();
	}
	
	@Path("/storeEmp")
	@POST
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.TEXT_PLAIN)
	public String storeEmployee(Employee emp) {
		int count = service.insertObject(emp);
		return count+" Record added";
	}
	
	@Path("/update/{i}/{s}")	//update/555/87000
	@PUT
	@Produces(MediaType.APPLICATION_XML)
	public Employee updateEmployeeSalary(@PathParam("i")int id, 
			@PathParam("s") double salary) {
		Employee e = service.updateSalary(id, salary);
		return e;
	}

	

}
