
public class main03 {

	public static void main(String[] args) {
		
		ShapeReader sr = new ShapeReader();
		sr.readShape(new Circle(10));	//Shape shape = new Circle(10);
		System.out.println();
		sr.readShape(new Square(3,4));	//Shape shape = new Square(3,4);
		System.out.println();
		sr.readShape(new Triangle(5, 6));
		
		
		//추상 클래스는 자식 클래스에 의해서만 메모리 할당을 받을 수 있다.
		Shape s = new Circle(10);
		
		//sr.readShape(new Shape());	//error!
	}

}
