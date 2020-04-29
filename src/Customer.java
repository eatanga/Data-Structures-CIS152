
public class Customer {
	private int customerId;
	private String name;
	private String phone;
	

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int id, String name, String phone) {
		super();
		this.customerId = id;
		this.name = name;
		this.phone = phone;
	}
	public Customer(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}

	public int getCustomerId() {
		return customerId;
	}

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public void setName(String fullName) {
		this.name = fullName;
	}

	public void setTelephoneNumber(String phone) {
		this.phone = phone;
	}


}
