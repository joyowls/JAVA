//자식클래스
//상속키워드: extends
//확장이라는 의미를 가지고 있고, 상속의 개념(중복된 기능들을 상속 시켜준다) 
//라기보다는 기초 클래스를 기반으로 한 확장 클래스르 만든다 라고 생각
//따라서 Child클래스는 Parent클래스를 확장시켜 만든 클래스다 라고 생각
public class Child extends Parent {
	
	
	public Child(){
		System.out.println("Child() 생성자 호출");
	}
	
	public void goo() {
		foo();
		System.out.println("Child.goo()");
	}
}
