
public class Child2 extends Parent2 {
	
	//�ڽ�Ŭ������ �θ� Ŭ������ ��ü ������ ���� å���� ���� �Ѵ�.
	//�ڽ� Ŭ������ �����ڿ��� �θ� Ŭ������ �����ڿ� ���� å���� ����.(���������� �θ��� �����ڸ� ȣ���Ͽ� ��ü�� �����.)
	
	private int num3;
	private int num4;
	
	public Child2(int num1,int num2, int num3, int num4){
									
		//System.out.println(); 	//error! ->�ڽ�Ŭ������ ������ �θ�Ŭ������ ��������� ��ü�� �����ߵȴ�.
									//�θ� Ŭ������ �����Ǳ� �� �ڽ� Ŭ������ �ƹ��͵� �� �� ����.
									//�θ� Ŭ������ �����ڸ� ȣ���ϴ� super(..) �������� ��� �ڵ嵵 ��� �� �� ����.
		super(num1, num2);	//�θ� Ŭ���� ��ü�� ��������� �Ű����� ����
							//�ڽ�Ŭ�������� �θ� Ŭ������ ����� ���� �Ű� ������ ��� �޴´�.
		
		this.num3 = num3;
		this.num4 = num4;
		
		System.out.println("Child2 ������ ȣ��");
	}
	
	public void showChildInfo(){
		System.out.println("num3 : "+ this.num3);
		System.out.println("num4 : "+ this.num4);
	}
	
}