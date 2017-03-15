
public class Calculator implements Icalculator {
	
	private Icalculator calc;
	
	public void setCalc(Icalculator calc){
		this.calc = calc;
	}
	@Override
	public void monadic(double num1, int mode) {
		// TODO Auto-generated method stub
		calc.monadic(num1, mode);
	}

	@Override
	public void binomial(double num1, double num2, int mode) {
		// TODO Auto-generated method stub
		calc.binomial(num1, num2, mode);
	}

	@Override
	public void monadicPrint() {
		// TODO Auto-generated method stub
		calc.monadicPrint();
	}

	@Override
	public void binomialPrint() {
		// TODO Auto-generated method stub
		calc.binomialPrint();
	}

	
	
}
