
public class main04 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;
		
		System.out.println(num1>10);	//false <= num1�� 10 ���� ū��?
		System.out.println(num1>=10);	//true  <= num1�� 10���� ũ���� ������?		
		
		System.out.println(num2 <10);	//true
		System.out.println(num2 <num1); //num2�� ����ִ� ���� num1�� ����ִ� ������ ������?
		
		// =  -> ���� ����
		// == -> ���� ����(���ʰ��� ������ ���� ������)
		// != -> ���ʰ��� �����ʰ��� �ٸ���
		System.out.println(num1 == 10); 	//num1�� ����ִ� ���� 10 �� ������?
		System.out.println(num1 != 10); 	//num1�� ����ִ� ���� 10 �� �ٸ���? (������false �ٸ��� true)
		System.out.println(num1 !=num2);	//true => �ٸ��� ������
		
		// && = AND : ������ �����̸� ������ ������ �������� �ʴ´�.
		// || = OR	: ������ ���̸� ������ �������������� �ʴ´�.
		System.out.println(num1 > 5 && num1 <=10); 	//num1�� 5���� ũ��, 10���� �۰ų� ������(true)
		System.out.println(num2 <=5 || num2 >10);	//num2�� 5���� �۰ų� ���ų� 10���� ū��(true)
		
		//5<num<10	=> �߸��� ����
		
		//���ǿ�����(���׿�����) => ?
		//����(��, ��) -> boolean ���  ? ���϶� ������ ���� : �����϶� ������ ����
		int num3 = num1 < num2 ? 10 : 20;	//num1�� num2���� ũ�ٸ� num3�� 10�� ����ְ�
											//�ƴϸ� 20�� ���� �־��.
		System.out.println(num3);
		
		double num4 = 5;
		num4 += 5;	//num4 = num4 + 5
		
		System.out.println(num4);
		
		num4 -= 10;	//num4 = num4 - 10
		
		System.out.println((double)num4);
		
		num4 *= 1;	//num4 = num4 * 1
		num4 /= 1; 	//num4 = num4 / 1
	
	
	}

}
