
public class circle {
	private int r;
	private double result;
	
	public void setR(int r) {
		this.r = r;
	}
	private void circle(){
		System.out.println("원");
		System.out.println("반지름 길이:"+r);
	}
	
	public void circleResult(){
		circle();
		result=r*r*3.14;
		System.out.println("원넓이"+ result);
	}
		
}
