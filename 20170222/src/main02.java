
public class main02 {

	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		calc.setNum1(10);	//����ڰ� ù��° �� �Է�
		calc.setNum2(20);	//����ڰ� �ι�° �� �Է�
		
		//Ư���˰��� ����
		//calc.specialAlgoritm();
		calc.runAdd();
		
		int addResult = calc.getResult();
		System.out.println("������� =" + addResult);
		
		
	}

}
