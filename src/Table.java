

public class Table {
	private long tableId;
	private int size;
	private Customer customer;
	
	public Customer getCustomer() {
		return customer;
	}
	


	public Table(int size) {
		super();
		this.size = size;
	}



	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	public Table() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Table(long tableId, int size, TableType type) {
		super();
		this.tableId = tableId;
		this.size = size;
	}


	public long getTableId() {
		return tableId;
	}


	public int getSize() {
		return size;
	}


	public void setTableId(long tableId) {
		this.tableId = tableId;
	}


	public void setSize(int size) {
		this.size = size;
	}
	
	public TableType getType(int size) {
		if(size==1) {
			return TableType.HighTable;
		}else {
		if(size == 2 ) {
			return TableType.Booth;
		}else {
		if(size >2 && size <=5) {
			return TableType.family;
		}
		else
		{
		return null;
		}
		}
		}
	}


	public void setType(TableType type) {
	}


	public boolean isAvailable(int time){
		// check if this table is available begin from reserve time, the default duration is 2 hours.
		return true;
	}
	
}
