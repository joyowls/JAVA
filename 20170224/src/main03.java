
public class main03 {

	public static void main(String[] args) {
		
		ShapeReader sr = new ShapeReader();
		sr.readShape(new Circle(10));	//Shape shape = new Circle(10);
		System.out.println();
		sr.readShape(new Square(3,4));	//Shape shape = new Square(3,4);
		System.out.println();
		sr.readShape(new Triangle(5, 6));
		
		
		//�߻� Ŭ������ �ڽ� Ŭ������ ���ؼ��� �޸� �Ҵ��� ���� �� �ִ�.
		Shape s = new Circle(10);
		
		//sr.readShape(new Shape());	//error!
	}

}
