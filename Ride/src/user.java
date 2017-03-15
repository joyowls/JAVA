
public class user implements IUser {

	public static final int BIG3 = 1;
	public static final int BIG5 = 2;
	public static final int FREETICKET = 3;

	@Override
	public void Ticket(int num1) {

		// TODO Auto-generated method stub
		switch (num1) {
		case 1:

			System.out.println(">>BIG3을 선택하셨습니다.");
			System.out.println(">>놀이기구를 3번 타실 수 있습니다.");

			break;
		case 2:

			System.out.println(">>BIG5을 선택하셨습니다.");
			System.out.println(">>놀이기구를 5번 타실 수 있습니다.");

			break;
		case 3:
			System.out.println(">>자유이용권을 선택하셨습니다.");

			break;
		case 4:
			System.exit(num1);
		}
	}

	@Override
	public void TicketPrint() {
		// TODO Auto-generated method stub
		System.out.println("1)big3\t2)big5\t3)자유이용권\t4)종료");
	}

}
