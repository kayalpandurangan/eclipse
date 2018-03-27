package pack;

import org.springframework.beans.factory.annotation.Autowired;

public class customer {
	
	private Identifier id;

	
@Autowired
private address address;
	public customer() {
		super();
		System.out.println("Customer() is called");
	}



	public customer(Identifier id) {
		super();
		System.out.println("Customer(identity) is called");
		this.id = id;
	}



	public Identifier getId() {
		System.out.println("getId() is called");
		return id;
	}



	public void setId(Identifier id) {
		System.out.println("setId() is called");
		this.id = id;
		
	}
	public void getInformation(){
		id.display();
		address.display(); 
	}



	public address getAddress() {
		return address;
	}



	public void setAddress(address address) {
		this.address = address;
	}
	
	
	}
	

