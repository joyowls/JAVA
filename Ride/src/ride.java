
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
			System.out.println(">>범퍼카를 타셨습니다.");
			break;
		case 2:
			System.out.println(">>롤러코스터를 타셨습니다.");
			break;
		case 3:
			System.out.println(">>바이킹을 타셨습니다.");
			break;
		case 4:
			System.out.println(">>후룹라이드를 타셨습니다.");
			break;
		case 5:
			System.out.println(">>회전목마를 타셨습니다.");
			break;
		case 6:
			System.out.println(">>모험을 타셨습니다.");
			break;
		case 7:
			System.out.println(">>기차를 타셨습니다.");
			break;
		case 8:
			System.out.println(">>자이로드롭을 타셨습니다.");
			break;
		default:
			System.exit(9);
		}

	}

	@Override
	public void rideList() {
		// TODO Auto-generated method stub
		System.out.println("1)범퍼카\t2)롤러코스터\t3)바이킹\t4)후룹라이드");
		System.out.println("5)회전목마\t6)모험\t7)기차\t8)자이로드롭\t9)종료");
	}

}
