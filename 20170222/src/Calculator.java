
public class Calculator {
	
	//����
	
	private int num1,num2;
	private int result;
	
	
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public int getResult() {
		return result;
	}
	
	//����ڰ� �� �ʿ�� ������ �ݵ�� ���� �ؾ� �� �޼ҵ�
	private void specialAlgoritm(){
		System.out.println("Ư���˰��� ����");
	}
	
	public void runAdd(){
		specialAlgoritm();
		result=num1+num2;
	}

	
	
}
