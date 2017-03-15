
public class HingedDoor2 implements IDoor {

	@Override
	public void openDoor() {
		System.out.println("문을 앞으로 밀어서 연다.");
		
	}

	@Override
	public void closeDoor() {
		System.out.println("문을 뒤로 당겨서 닫는다.");
		
	}
}
