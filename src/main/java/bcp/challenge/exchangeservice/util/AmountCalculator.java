package bcp.challenge.exchangeservice.util;

public class AmountCalculator {

	public static String calculate(String amount, double exchangeRate) {
		return String.valueOf(exchangeRate * (Double.valueOf(amount)));
	}

}
