
public class main02 {

	public static void main(String[] args) {
		
		int a = 11;
		int b = 10;
		
		//if~else	=>이거 아님 저거
		
		if(a>b){
			System.out.println("a는 b보다 크다");
		}
		else{		//if 조건이 맞이 않으면 else 문 실행
			System.out.println("a는 b보다 같거나 작다");
		}
				
		if(a==b){
			System.out.println("a와 b가 같다");
		}
		else{
			System.out.println("a는 b와 다르다");
		}
		
		if(a==b){
			System.out.println("a는 b와 같다");
		}
		else if ( a > b){
			System.out.println("a는 b보다 크다");
		}
		else if (a < b){
			System.out.println("a는 b 보다 작다");
		}
		else{
			System.out.println("a는 b보다 작다");
		}
		
		
	}

}
