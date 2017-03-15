public class main01 {

	public static void main(String[] args) {
		Circle circle = new Circle(10);
		circle.showShapeInfo();

		Square square = new Square(3, 5);
		square.showShapeInfo();
		
		Triangle triangle = new Triangle(2,4);
		triangle.showShapeInfo();
	
		System.out.println(circle);
	}
	

}
