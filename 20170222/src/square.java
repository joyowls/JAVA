
public class square {
	private int x,y;
	private int result;
	
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	private void square(){
		System.out.println("�簢��");
		System.out.print("���α���:"+x+"\t");
		System.out.println("���α���:"+y);
	}
	
	public void squareResult(){
		square();		
		result=x*y;
		System.out.println("����:"+result);
	}
		
}
