//주석에는 간단한 필요한 메모를 쓴다
public class main01 {
	//프로그램 시작 시점
	public static void main(String[] args) {
		System.out.println("Hello World!");//콘솔에 Hello World 출력
		
		//변수는 무조건 초기화가 되어야 사용 할 수 있다.
		int num1 = 10;  //선언과 동시 초기화
		
		int num2;		//변수의 선언
		num2 = 20;		//초기화
		
		//int num3;		//변수선언되고 초기화 되지 않아서 에러
		
		num2 = 30;		//대입
		
		System.out.println(num1);
		System.out.println(num2);
		//System.out.println(num3);
		System.out.println('A');
	}

}
