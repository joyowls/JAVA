
public class circle {
	private int r;
	private double result;
	
	public void setR(int r) {
		this.r = r;
	}
	private void circle(){
		System.out.println("��");
		System.out.println("������ ����:"+r);
	}
	
	public void circleResult(){
		circle();
		result=r*r*3.14;
		System.out.println("������"+ result);
	}
		
}
