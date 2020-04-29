
public class Table {
	private long tableId;
	private int size;
	private TableType type;
	

	public Table() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Table(long tableId, int size, TableType type) {
		super();
		this.tableId = tableId;
		this.size = size;
		this.type = type;
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
	
	public TableType getType() {
		return type;
	}


	public void setType(TableType type) {
		this.type = type;
	}


	public boolean isAvailable(int time){
		// check if this table is available begin from reserve time, the default duration is 2 hours.
		return true;
	}
}
