
public class Customer {
	private int customerId;
	private  static int nextCustomerId;
	private static String name;
	private static String phone;
	

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer( String name, String phone) {
		super();
		
		nextCustomerId++;
		this.customerId = nextCustomerId;
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

	public void setPhone(String phone) {
		this.phone = phone;
	}


}
