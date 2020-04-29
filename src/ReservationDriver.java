import java.util.Scanner;

public class ReservationDriver {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Priority Queue Test\n");
		System.out.println("<------------------------------->");
		System.out.println("Enter your Name\n");		
		String cName = scan.nextLine();
		System.out.println("Enter start time\n");
		int sTime = scan.nextInt();
		System.out.println("How many Seats?\n");
		int seats = scan.nextInt();
		System.out.println("Enter Phone Number\n");
		String ph = scan.nextLine();
		
		Customer c = new Customer(cName,ph);
		Table t = new Table();
		Reservation r = new Reservation();
		t.setSize(seats);
		r.setStartTime(sTime);
		
	

		


		char ch;
		/* Perform Priority Queue operations */
		do {
			System.out.println("\nWelcome to Diner Reservations\n");
			System.out.println("1. Start A Reservation");
			System.out.println("2. Cancel A Reservation");
			System.out.println("3. Check Reservation");
			ReservationSystem rs = new ReservationSystem();
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				rs.makeReservation(c,r.getTime(),t.getSize());
				break;
			case 2:
				rs.cancelReservation(c);
				break;
			case 3:
				rs.getReservation(c);
				break;
			default:
				System.out.println("Wrong Entry \n ");
				break;
			}

			System.out.println("\nDo you want to continue (Type y or n) \n");
			ch = scan.next().charAt(0);
		} while (ch == 'Y' || ch == 'y');
	}

}
