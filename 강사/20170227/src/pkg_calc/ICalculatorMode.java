package pkg_calc;

public interface ICalculatorMode {
	
	void monadic(double num, int mode);
	void binomial(double num1, double num2, int mode);
	
	//공학, 일반이던 할 수 있는 계산 리스트 출력
	void printMonadic();
	void printBinomial();
	
}