
//도형 클래스
//모든 도형클래스들의 기초 클래스

//추상클래스
// 추상클래스란 개념만 가지고 있는 대상을 설계한 클래스이다.
// 따라서 명확한 기능의 정의를 내리기 힘든 경우 사용한다.

// ex)도형의 정보를 표시해라(어떤 도형인지 모름)
// ex)넓이를 구해라


// 하지만 추상클래스엔 명확한 기능을 정의 할 수도 있다.
// ex) 새는 날 수 있다.
public abstract class Shape {
		
		//모든 도형들의 공통적인 데이터
		protected double area; //넓이
		
		//모든 도형들의 공통적인 메소드( 넓이 구하기)
		protected void makeArea(){
			System.out.println("---넓이 구하기---");
		}

		//도형의 정보 보기
		
		// 기능의 정의를 명확하게 내릴 수 없는 메소드
		// 추상화의 대상이 되는 메소드
		public abstract void showShapeInfo();
		

	}

