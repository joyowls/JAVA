
public class main04 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;
		
		System.out.println(num1>10);	//false <= num1이 10 보다 큰가?
		System.out.println(num1>=10);	//true  <= num1이 10보다 크보다 같은가?		
		
		System.out.println(num2 <10);	//true
		System.out.println(num2 <num1); //num2가 들고있는 값이 num1이 들고있는 값보다 작은가?
		
		// =  -> 대입 연산
		// == -> 등위 연산(왼쪽값과 오른쪽 값이 같은가)
		// != -> 왼쪽값과 오른쪽값이 다른가
		System.out.println(num1 == 10); 	//num1이 들고있는 값이 10 과 같은가?
		System.out.println(num1 != 10); 	//num1이 들고있는 값이 10 과 다른가? (같으면false 다르면 true)
		System.out.println(num1 !=num2);	//true => 다르기 때문에
		
		// && = AND : 왼쪽이 거짓이면 오른쪽 연산은 수행하지 않는다.
		// || = OR	: 왼쪽이 참이면 오른쪽 연산은수행하지 않는다.
		System.out.println(num1 > 5 && num1 <=10); 	//num1이 5보다 크고, 10보다 작거나 같은가(true)
		System.out.println(num2 <=5 || num2 >10);	//num2가 5보다 작거나 같거나 10보다 큰가(true)
		
		//5<num<10	=> 잘못된 문법
		
		//조건연산자(삼항연산자) => ?
		//조건(비교, 논리) -> boolean 결과  ? 참일때 실행할 문장 : 거짓일때 실행할 문장
		int num3 = num1 < num2 ? 10 : 20;	//num1이 num2보다 크다면 num3에 10을 집어넣고
											//아니면 20을 집어 넣어라.
		System.out.println(num3);
		
		double num4 = 5;
		num4 += 5;	//num4 = num4 + 5
		
		System.out.println(num4);
		
		num4 -= 10;	//num4 = num4 - 10
		
		System.out.println((double)num4);
		
		num4 *= 1;	//num4 = num4 * 1
		num4 /= 1; 	//num4 = num4 / 1
	
	
	}

}
