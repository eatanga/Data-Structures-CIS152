
import java.util.Scanner;

public class ReservationDriver {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		char ch;
		do {
			System.out.println("\nWelcome to Diner Reservations\n");
			System.out.println("1. Start A Reservation");
			System.out.println("2. Cancel A Reservation");
			System.out.println("3. Check Reservation");
			
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				startReservation();
				break;
			case 2:
				deleteReservation();
				break;
			case 3:
				findReservation();
				break;
			default:
				System.out.println("Wrong Entry \n ");
				break;
			}

			System.out.println("\nDo you want to continue (Type y or n) \n");
			ch = scan.next().charAt(0);
		} while (ch == 'Y' || ch == 'y');
	}
	
	 private static void startReservation() {
		 
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter your Name\n");		
			String cName = scan.nextLine();
			System.out.println("Enter start time\n");
			int sTime = scan.nextInt();
			System.out.println("How many Seats?\n");
			int seats = scan.nextInt();
			System.out.println("Enter Phone Number\n");
			String ph = scan.nextLine();
			
			Customer c = new Customer();
			c.setName(cName);
			c.setPhone(ph);
			Table t = new Table();
			Reservation r = new Reservation();
			ReservationSystem rs = new ReservationSystem();
			t.setSize(seats);
			r.setStartTime(sTime);
			rs.makeReservation(c,r.getStartTime(),t.getSize());
	    }
	 private static void deleteReservation() {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter your Name\n");		
			String cName = scan.nextLine();
			System.out.println("Enter Phone Number\n");
			String ph = scan.nextLine();			
			Customer c = new Customer();
			c.setName(cName);
			c.setPhone(ph);
			ReservationSystem rs = new ReservationSystem();
			rs.cancelReservation(c);
			 
	 }
	 private static void findReservation() {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter your Name\n");		
			String cName = scan.nextLine();
			System.out.println("Enter Phone Number\n");
			String ph = scan.nextLine();			
			Customer c = new Customer();
			c.setName(cName);
			c.setPhone(ph);
			ReservationSystem rs = new ReservationSystem();
			rs.getReservation(c);
	 }

}
