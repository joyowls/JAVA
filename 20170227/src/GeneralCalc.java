
public class GeneralCalc implements Icalculator {
	
	public static final double log = 1;
	public static final double sqrt = 2;
	
	public static final double add = 3;
	public static final double sub = 4;
	public static final double mul = 5;
	public static final double div = 6;
	
	
	@Override
	public void monadic(double num1, int mode) {
		// TODO Auto-generated method stub
		switch(mode){
		case 1 : double log = Math.log(num1);
		System.out.println("log���:"+log);
		break;
		case 2 : double sqrt = Math.sqrt(num1);
		System.out.println("sqrt���:"+sqrt);
		break;
		}
	}

	@Override
	public void binomial(double num1, double num2, int mode) {
		// TODO Auto-generated method stub
		switch(mode){
		case 1 : double add = num1 + num2;
		System.out.println("�������:"+add);
		break;
		case 2 : double sub = num1 - num2;
		System.out.println("�������:"+sub);
		break;
		case 3 : double mul = num1 * num2;
		System.out.println("�������"+mul);
		break;
		case 4 : double div = num1/num2;
		System.out.println("���������:"+div);
		break;
		}
	}

	@Override
	public void monadicPrint() {
		// TODO Auto-generated method stub
		System.out.println("1)log \t 2)sqrt");
	}

	@Override
	public void binomialPrint() {
		// TODO Auto-generated method stub
		System.out.println("1)add\t2)sub\t3)mul\t4)div");
	}
	
}
