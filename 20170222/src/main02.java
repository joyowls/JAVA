
public class main02 {

	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		calc.setNum1(10);	//사용자가 첫번째 수 입력
		calc.setNum2(20);	//사용자가 두번째 수 입력
		
		//특수알고리즘 실행
		//calc.specialAlgoritm();
		calc.runAdd();
		
		int addResult = calc.getResult();
		System.out.println("덧셈결과 =" + addResult);
		
		
	}

}
