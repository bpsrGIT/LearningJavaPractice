package Practice;

import java.math.BigDecimal;

public class SimpleInterestCalculator {
	BigDecimal principalAmount;
	BigDecimal interestRate;

	SimpleInterestCalculator(int principal, String interest) {
		principalAmount = new BigDecimal(principal);
		interestRate = new BigDecimal(interest).divide(new BigDecimal(100));
	};

	BigDecimal totalSum;

	public void calculateTotalValue(int years) {
		totalSum = principalAmount.add(principalAmount.multiply(interestRate).multiply(new BigDecimal(years)));
	};

}
