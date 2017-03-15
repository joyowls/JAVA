public class house {

	// 문
	// 슬라이드 도어 (미닫이 문)
	// 1단계 관계
	// house 클래스가 SlideDoor 클래스를 가지고 있다.('house' Has -a 'SlideDoor')
	private SlideDoor slidedoor;
	private HingedDoor hingeddoor;

	public house() {
		slidedoor = new SlideDoor();
		hingeddoor = new HingedDoor();
	}

	public void in() {
		slidedoor.openDoor();
		System.out.println("집에 들어옴");
	}

	public void out() {
		slidedoor.closeDoor();
		System.out.println("집에서 나감");
	}

	public void in2() {
		hingeddoor.openDoor();
		System.out.println("집에 들어옴");
	}

	public void out2() {
		hingeddoor.closeDoor();
		System.out.println("집에서 나감");
	}
}
