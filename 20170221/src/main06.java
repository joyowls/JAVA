
public class main06 {

	public static void main(String[] args) {
		
		//while(����)
			//�ѹ��� ������� �������� �ִ�.
			//while�� ���� �� ������ false �ϰ��
		
		//do ~ while(����)
			//������ ���� �ʴ��� ������ �ѹ��� ����ȴ�.
		
		int a = 10;
		int b = 10;
		
		System.out.println("while�� ����");
		while(a != b){
			System.out.println("while~");
		}
		
		System.out.println("do ~ while�� ����");
		do{
			System.out.println("do ~ while");
		}
		while(a != b);
		
		//while�� Ȱ��		// ~ �� �� ���� �ݺ��ض�
		//�ش� while���� for������ ��ü ������
		while(a < 20){
			System.out.println("while�� �Դϴ�."+a);
			a++;	//while�� �ݺ��� �����ؾ� �ϴ� ������ while�� ���ο� �־���Ѵ�.
					//���� ���� �ܺο� �����ϱ⵵ �Ѵ�.(ex : thread)
		}
				
	}

}
