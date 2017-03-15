public class circle {
	private int r;
	private double result;

	public circle(int r) {
		this.r = r;
	}
	public void setR(int r) {
		this.r = r;
	}
	public double getResult() {
		return result;
	}
	private void circle(){
		result=r*r*3.14;
		System.out.println("원");
		System.out.println("반지름 길이:"+r);
	}
	
	public void circleResult(){
		circle();		
		System.out.println("원넓이"+ result);
	}
	

}
