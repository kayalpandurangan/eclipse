package pack;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "c")


public class customer extends person{
	private String bankName;

	public customer(int uid, String name, String bankName) {
		super(uid, name);
		this.bankName = bankName;
	}

	public customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	


}
