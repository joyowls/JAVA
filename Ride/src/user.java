
public class user implements IUser {

	public static final int BIG3 = 1;
	public static final int BIG5 = 2;
	public static final int FREETICKET = 3;

	@Override
	public void Ticket(int num1) {

		// TODO Auto-generated method stub
		switch (num1) {
		case 1:

			System.out.println(">>BIG3�� �����ϼ̽��ϴ�.");
			System.out.println(">>���̱ⱸ�� 3�� Ÿ�� �� �ֽ��ϴ�.");

			break;
		case 2:

			System.out.println(">>BIG5�� �����ϼ̽��ϴ�.");
			System.out.println(">>���̱ⱸ�� 5�� Ÿ�� �� �ֽ��ϴ�.");

			break;
		case 3:
			System.out.println(">>�����̿���� �����ϼ̽��ϴ�.");

			break;
		case 4:
			System.exit(num1);
		}
	}

	@Override
	public void TicketPrint() {
		// TODO Auto-generated method stub
		System.out.println("1)big3\t2)big5\t3)�����̿��\t4)����");
	}

}
