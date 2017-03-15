public class Square extends Shape {

	private int x;
	private int y;

	public Square(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	protected void makeArea() {
		super.makeArea();
		super.area = this.x * this.y;
	}
	
	@Override
	public void showShapeInfo() {
		makeArea();
		System.out.println("가로길이 : " + this.x);
		System.out.println("세로길이 : " + this.y);
		System.out.println("넓이 : " + super.area);

	}

	public void stack(){
		System.out.println("사각형을 쌓는다.");
	}
	
	
}
