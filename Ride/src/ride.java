
public class ride implements IRide {
	public static final int BUMPERCAR = 1;
	public static final int LOLLERCOSTER = 2;
	public static final int VIKING = 3;
	public static final int HURUPRIDE = 4;
	public static final int HORSE = 5;
	public static final int ADVENTURE = 6;
	public static final int TRAIN = 7;
	public static final int GYRODROP = 8;

	@Override
	public void information(int num1, int num2) {
		// TODO Auto-generated method stub

		switch (num1) {
		case 1:
			System.out.println(">>����ī�� Ÿ�̽��ϴ�.");
			break;
		case 2:
			System.out.println(">>�ѷ��ڽ��͸� Ÿ�̽��ϴ�.");
			break;
		case 3:
			System.out.println(">>����ŷ�� Ÿ�̽��ϴ�.");
			break;
		case 4:
			System.out.println(">>�ķ���̵带 Ÿ�̽��ϴ�.");
			break;
		case 5:
			System.out.println(">>ȸ���񸶸� Ÿ�̽��ϴ�.");
			break;
		case 6:
			System.out.println(">>������ Ÿ�̽��ϴ�.");
			break;
		case 7:
			System.out.println(">>������ Ÿ�̽��ϴ�.");
			break;
		case 8:
			System.out.println(">>���̷ε���� Ÿ�̽��ϴ�.");
			break;
		default:
			System.exit(9);
		}

	}

	@Override
	public void rideList() {
		// TODO Auto-generated method stub
		System.out.println("1)����ī\t2)�ѷ��ڽ���\t3)����ŷ\t4)�ķ���̵�");
		System.out.println("5)ȸ����\t6)����\t7)����\t8)���̷ε��\t9)����");
	}

}
