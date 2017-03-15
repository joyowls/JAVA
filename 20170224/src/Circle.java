public class Circle extends Shape {
	private int r;

	public Circle(int r) {
		// super();
		this.r = r;
	}

	// �������̵��� ����
	// 1)��ȯ�� �޼ҵ��, �Ű������� �θ��� �޼ҵ�� �Ϻ��� ��ġ �ؾ� �Ѵ�.
	// 2)�������� �����ڴ� �θ��� �ͺ��� �аų� ���ƾ��Ѵ�.
	
	@Override
	protected void makeArea() {
		super.makeArea();// �θ��� �޼ҵ� ȣ��(super.�޼ҵ��)
		super.area = this.r * this.r * 3.14;
	}
	
	
	@Override
	public void showShapeInfo() {
		// ���� ���ϱ�
		makeArea();
		System.out.println("������ : " + this.r);
		System.out.println("����  : " + super.area);
	}

	
	
	//Object Ŭ������ ���Ǳ� toString() �������̵�
	//=>Object Ŭ�������� ��ü�� ǥ���ϴ� ���(��Ű����.Ŭ����@�޸� �ּҰ�)�� �ƴ�
	//	�ش� Ŭ������ ������ ������� ���� �� �� �ְ� �� �ش�.
	// 	������ ��� ������ ���� Ȯ���ϴ� �뵵�� �����.
	
	@Override
	public String toString() {
		//return super.toString();	//�θ��� toString�� ������ ����
									//Ŭ����@�޸� �ּҰ�
		return"[������:"+this.r+"]"+"[����:"+ super.area+"]";
	}
	
	public void rolling(){
		System.out.println("���� ��������.");
	}
}
