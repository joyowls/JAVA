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
		System.out.println("��");
		System.out.println("������ ����:"+r);
	}
	
	public void circleResult(){
		circle();		
		System.out.println("������"+ result);
	}
	

}
