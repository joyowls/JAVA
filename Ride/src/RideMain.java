import java.util.Scanner;

public class RideMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UserRide userRide = new UserRide();
		userRide.setRide(new ride());
		userRide.setUser(new user());

		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("---------------------------");
			userRide.TicketPrint();
			int selectTicket = 0;
			int selectRide = 0;
			int chance = 0;
			System.out.print(">>");
			selectTicket = scan.nextInt();
			if (selectTicket == 1) {
				userRide.Ticket(selectTicket);
				chance = 3;
			} else if (selectTicket == 2) {
				userRide.Ticket(selectTicket);
				chance = 5;
			} else if (selectTicket == 3) {
				userRide.Ticket(selectTicket);
				chance = 10000;
			} else {
				System.exit(4);
			}
			while (chance != 0) {
				userRide.rideList();
				System.out.print(">>");
				selectRide = scan.nextInt();
				userRide.information(selectRide, chance);
				chance = chance - 1;
			}
			if (chance == 0) {
				System.out.print(">>");
				System.out.println("이용권을 모두 사용하셨습니다.");
			}
		} while (true);
	}
}
