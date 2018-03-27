package pack;

import java.util.List;

public class bank {
	private String bankName;
	private List locations;
	public bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	public bank(String bankName, List locations) {
		super();
		this.bankName = bankName;
		this.locations = locations;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public List getLocations() {
		return locations;
	}
	public void setLocations(List locations) {
		this.locations = locations;
	}
	
	
	

}
