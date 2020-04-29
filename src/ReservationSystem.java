import java.util.ArrayList;
import java.util.HashMap;

public class ReservationSystem {
	HashMap<Long, Reservation> map;
//From 9am to 10pm, each hour have a list of tables
	ArrayList<Table>[] tables;
	
	int MAX_TIME = 2;//Maximum Reservation stay time

	public Reservation getReservation(Customer customer) {
		return map.get(customer);
	}

	public void makeReservation(Customer customer, int startTime, int size) {
		Table newTable = findTable(startTime, size);
		if (newTable != null) {
			Reservation newReservation = new Reservation(newTable, customer, startTime);
			long customerId = customer.getCustomerId();
			map.put(customerId, newReservation);
			removeTable(startTime, newTable);
		} else {
			System.out.println("No Available tables reservations");
		}
	}

	public void cancelReservation(Customer customer) {
		Reservation newReservation = map.remove(customer.getCustomerId());
		addTable(newReservation.getTime(), newReservation.getTable());
	}

	public Table findTable(int startTime, int size) {
		ArrayList<Table> tableList = tables[startTime - 10];
		for (Table t : tableList) {
			if (t.getSize() >= size) {
				return t;
			}
		}
		return null;
	}

	public void removeTable(int startTime, Table table) {
		int index = startTime - 10;
		int period = MAX_TIME;
		while (index + period - 1 < tables.length && period > 0) {
			tables[index + period].remove(table);
			period--;
		}
	}

	public void addTable(int startTime, Table table) {
		int index = startTime - 10;
		int period = MAX_TIME;
		while (index + period - 1 < tables.length && period > 0) {
			tables[index + period].add(table);
			period--;
		}
	}

	public Reservation getReservation(Long customerId) {
		return map.get(customerId);
	}
}

