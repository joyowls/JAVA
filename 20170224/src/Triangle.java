public class Triangle extends Shape {
	private int x;
	private int y;

	public Triangle(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	protected void makeArea() {
		super.makeArea();
		super.area = this.x * this.y * 1 / 2;
	}
	
	@Override
	public void showShapeInfo() {
		makeArea();
		System.out.println("πÿ∫Ø ±Ê¿Ã : " + this.x);
		System.out.println("≥Ù¿Ã ±Ê¿Ã : " + this.y);
		System.out.println("≥–¿Ã : " + super.area);

	}
	
}
