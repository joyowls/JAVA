
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
		System.out.println("사각형");
		System.out.print("가로길이:"+x+"\t");
		System.out.println("세로길이:"+y);
	}
	
	public void squareResult(){
		square();		
		result=x*y;
		System.out.println("넓이:"+result);
	}
		
}
