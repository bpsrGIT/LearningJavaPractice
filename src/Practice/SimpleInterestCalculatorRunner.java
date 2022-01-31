package Practice;

public class SimpleInterestCalculatorRunner {

	public static void main(String[] args) {
		SimpleInterestCalculator calculator = new SimpleInterestCalculator(4500, "7.50");

		calculator.calculateTotalValue(5);

		System.out.println(calculator.totalSum);
	}

}
