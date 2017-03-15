import java.util.Scanner;

public class CalcMain {

	public static void main(String[] args) {
		System.out.println("1)일반용\t2)공학용");

		Scanner scan = new Scanner(System.in);
		Calculator Calc = new Calculator();

		int calcMode = 0;
		calcMode = scan.nextInt();

		if (calcMode == 1) {
			Calc.setCalc(new GeneralCalc());

		} else if (calcMode == 2) {
			Calc.setCalc(new ScientificCalc());

		} else {
			System.out.println("1과 2번중에 선택바람.");
		}

		System.out.println("1)단항\t2)이항");
		int calcModeMenu = 0;
		calcModeMenu = scan.nextInt();

		switch (calcModeMenu) {

		case 1:
			Calc.monadicPrint();
			System.out.print(">>");
			double num1 = 0;

			calcMode = scan.nextInt();
			System.out.print(">>");
			num1 = scan.nextDouble();

			Calc.monadic(num1, calcMode);

			break;

		case 2:
			Calc.binomialPrint();
			double num2 = 0;
			System.out.print(">>");
			calcMode = scan.nextInt();
			System.out.print(">>");
			num1 = scan.nextDouble();
			System.out.print(">>");
			num2 = scan.nextDouble();

			Calc.binomial(num1, num2, calcMode);
			break;

		}
	}

}
