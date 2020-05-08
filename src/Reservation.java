
public class Reservation {
	private long ReservationId;
	private Table table;
	private Customer customer;
	private int startTime;
	
	

	public Reservation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Reservation(Table table, Customer customer, int startTime) {
		super();
		this.table = table;
		this.customer = customer;
		this.startTime = startTime;
	}

	public long getReservationId() {
		return ReservationId;
	}

	public Customer getCustomer() {
		return customer;
	}

	public int getStartTime() {
		return startTime;
	}

	public void setReservationId(long reservationId) {
		ReservationId = reservationId;
	}

	public void setTable(Table table) {
		this.table = table;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}

	public Table getTable() {
		return table;
	}

	@Override
	public String toString() {
		return "Reservation [ReservationId=" + ReservationId + ", table=" + table + ", customer=" + customer
				+ ", startTime=" + startTime + "]";
	}
	
}
