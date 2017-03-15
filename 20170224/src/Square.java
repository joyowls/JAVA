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
		System.out.println("���α��� : " + this.x);
		System.out.println("���α��� : " + this.y);
		System.out.println("���� : " + super.area);

	}

	public void stack(){
		System.out.println("�簢���� �״´�.");
	}
	
	
}
