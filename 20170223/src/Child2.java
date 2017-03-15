
public class Child2 extends Parent2 {
	
	//자식클래스는 부모 클래스의 객체 생성에 대해 책임을 져야 한다.
	//자식 클래스의 생성자에서 부모 클래스의 생성자에 대한 책임을 진다.(명시적으로 부모의 생성자를 호출하여 객체를 만든다.)
	
	private int num3;
	private int num4;
	
	public Child2(int num1,int num2, int num3, int num4){
									
		//System.out.println(); 	//error! ->자식클래스는 무조건 부모클래스를 만들고나서 객체를 만들어야된다.
									//부모 클래스가 생성되기 전 자식 클래스는 아무것도 할 수 없다.
									//부모 클래스의 생성자를 호출하는 super(..) 이전에는 어떠한 코드도 들어 갈 수 없다.
		super(num1, num2);	//부모 클래스 객체를 만들기위해 매개변수 전달
							//자식클래스에서 부모 클래스를 만들기 위한 매겨 변수를 모두 받는다.
		
		this.num3 = num3;
		this.num4 = num4;
		
		System.out.println("Child2 생성자 호출");
	}
	
	public void showChildInfo(){
		System.out.println("num3 : "+ this.num3);
		System.out.println("num4 : "+ this.num4);
	}
	
}
