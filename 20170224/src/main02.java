
public class main02 {

	public static void main(String[] args) {
		//1) UpCasting
		//	�ڽ� is a �θ� ��� ������ ������� �ʴ�.(���� �����̴�..(o))
		Shape shape=new Circle(10);
		shape.showShapeInfo();
		
		//2) DownCasting
		// �θ� is a �ڽ� �̶�� ������ ����ϴ�.(������ ���̴�..(x))
		
		//Circle circle = new Shape();	//error! ������ ���̴� ��� ���谡 ���� �� �� ����.
		
		//UpCasting�� ���� ���� �Ǿ�� �Ѵ�.
		Square square = new Square(3,6);
		Shape squareShape = square; // Shape squareShape = new Square(3,6);
		
		Shape squareShape2 = new Square(3,6);
		
		Square downSquare = (Square)squareShape; //�� ������ �簢�� �̴�(o)
		Square downSquare2 = (Square)squareShape2;
				
		//Circle errorCircle = (Circle)squareShape;	//������ ������ ����.
										//����� ������ �߻��Ѵ�.
		
		//������ instanceof
		// A instanceof B => boolean �����
		// A�� BŬ������ �θ� �� �ִ°�? or A�� BŬ������ �̷���� �ִ°�?
		// ex) �θ� instanceof �ڽ� => �� �θ� �ڽ��̶�� �θ� �� �ִ°�?
							     //(�� ������ �簢���̶�� �� �� �ִ°�?)
		// ex) �ڽ� instanceof �θ� => �� �ڽ��� �θ� ������� �ϴ°�? 
								 //(�� �簢���� ������ ������� ������� �ִ°�?)
		
		//�� ������ �簢���Դϱ�?
		if(squareShape instanceof Square){
			System.out.println("�簢�� �Դϴ�");
		}
		if(shape instanceof Circle){
			System.out.println("�� �Դϴ�");
		}else{
			System.out.println("����, �簢���� �ƴմϴ�.");
		}
		
		//�簢���� �����Դϱ�?
		if(square instanceof Shape){
			System.out.println("�簢���� �����Դϴ�");
		}
		
	}

}
