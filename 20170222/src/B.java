
public class B {

	// 메소드 오버로딩
	// 메소드의 이름을 중복해서 선언 하는 것
	// 단, 매개변수의 타입(종류)와 갯수, 순서가 달라야한다.

	//오버로딩 기법을 사용하는 경우
	//메소드가 매개변수에 따라서 의미가 비슷한 작업을 진행 할 때
	//ex) system.out.println();
	
	//char 형태 출력 메소드명 : system.out.printChar(char ch);
	//int 형태 출력 메소드명 : system.out.printInt(int i);
	//Boolean 형태 출력 메소드명 : system.out.printBoolean(boolean b);
	void foo() {
		System.out.println("B_FOO()");
	}

	// 메소드의 이름이 똑같지만 매개변수가 다르기 때문에 선언 가능(오버로딩)
	void foo(int num) {
		System.out.println("B_FOO(int):" + num);
	}

	void foo(double d) {
		System.out.println("B_FOO(double):" + d);
	}

	// 매개변수의 갯구가 다르기 때문에 오버로딩 가능
	void foo(int num1, int num2) {
		System.out.println("B_FOO(int,int):" + num1 + "" + num2);
	}

	// 매개변수의 순서가 달라도 오버로딩 가능
	void foo(int num, double d) {
		System.out.println("B_FOO(int,double):" + num + "" + d);
	}

	void foo(double d, int num) {
		System.out.println("B_FOO(double,int):" + d + "" + num);
	}
	// 매개변수의 변수명은 오버로딩 가능 조건에 포함되지 않는다.
	/*
	  void goo(int num1){ System.out.println("B_GOO(int):"+ num1); }
	  
	  void goo(int num2){ System.out.println("B_GOO(int)L"+num2); }
	 */
}
