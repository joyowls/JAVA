public class square {
	private int x, y;
	private int result;

	public square(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getResult() {
		return result;
	}
	private void square(){
		result=x*y;
		System.out.println("�簢��");
		System.out.print("���α���:"+x+"\t");
		System.out.println("���α���:"+y);
	}
	
	public void squareResult(){
		square();		
		System.out.println("����:"+result);
	}

}
