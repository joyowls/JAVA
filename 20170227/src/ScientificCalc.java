
public class ScientificCalc implements Icalculator {

	
	private double i;
	private double result;
	
	public static final double sin = 1;
	public static final double cos = 2;
	public static final double tan = 3;
	public static final double fac = 4;

	public static final double yroot = 5;
	public static final double mod = 6;

	@Override
	public void monadic(double num1, int mode) {
		// TODO Auto-generated method stub
		switch(mode){
		case 1 : double sin = Math.sin(num1);
		System.out.println("sin결과:"+sin);
		break;
		case 2 : double cos = Math.cos(num1);
		System.out.println("cos결과:"+cos);
		break;
		case 3 : double tan = Math.tan(num1);
		System.out.println("tan결과:"+tan);
		break;
		case 4 : 
				for(int i = (int)num1; i >=1; i--){
				result = result* i;
			}		
				
				int fac = (int) result;
				System.out.println("factorial결과:"+fac);
			break;
			
		}
	}

	@Override
	public void binomial(double num1, double num2, int mode) {
		// TODO Auto-generated method stub
		switch(mode){
		case 5 : double yroot = Math.pow(num1, num2);
		System.out.println("yroot결과:"+yroot);
		break;
		case 6 : double mod = num1%num2;
		System.out.println("mod결과:"+mod);
		break;
		
		
		}
	}

	@Override
	public void monadicPrint() {
		// TODO Auto-generated method stub
		System.out.println("1)sin\t2)cos\t3)tan\t4)factorial");
	}

	@Override
	public void binomialPrint() {
		// TODO Auto-generated method stub
		System.out.println("1)yroot\t2)mod");
	}

}
