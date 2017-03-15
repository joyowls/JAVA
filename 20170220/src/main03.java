
public class main03 {
//연산자의 우선순위
	public static void main(String[] args) {
		int a = 10;
		a++;		//후위 증가(세미콜론을 지나가면 1 증가)
		System.out.println(a);
		
		int b = 10;
		++b;		//전위 증가(세미콜론을 만나기전에 1 증가)
		System.out.println(b);
		
		int c = 10;
		int d = 10;
		
		System.out.println(c++);
		System.out.println(++d);
		
		System.out.println(2+2);	//4
		System.out.println(2+2*2); 	//곱셈이 먼저 우선순위가 높기때문에 *부터 실행(6)
		System.out.println(2+2/2*3+2/1-3+1/4*2);
		System.out.println(2+((2/2)*3)+(2/1)-3+((1/4)*2)); 
		
		//메모리 크기에 따른 나눗셈
		System.out.println(5/2);	//몫 구하기
		System.out.println(5%2); 	//나머지 구하지
		System.out.println((double)5/2);	//2.5
		System.out.println(5/(double)2);	//2.5
		System.out.println((double)(5/2));	//2.0  (5/2)먼저 실행후 double형태로 형변환
		
		System.out.println();
	}
	
}
