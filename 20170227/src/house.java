public class house {

	// ��
	// �����̵� ���� (�̴��� ��)
	// 1�ܰ� ����
	// house Ŭ������ SlideDoor Ŭ������ ������ �ִ�.('house' Has -a 'SlideDoor')
	private SlideDoor slidedoor;
	private HingedDoor hingeddoor;

	public house() {
		slidedoor = new SlideDoor();
		hingeddoor = new HingedDoor();
	}

	public void in() {
		slidedoor.openDoor();
		System.out.println("���� ����");
	}

	public void out() {
		slidedoor.closeDoor();
		System.out.println("������ ����");
	}

	public void in2() {
		hingeddoor.openDoor();
		System.out.println("���� ����");
	}

	public void out2() {
		hingeddoor.closeDoor();
		System.out.println("������ ����");
	}
}
