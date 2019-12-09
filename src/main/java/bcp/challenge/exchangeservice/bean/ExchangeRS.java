package bcp.challenge.exchangeservice.bean;

public class ExchangeRS {
	private String amount;
	private String originCurrency;
	private String destinationCurrency;
	private String amountWithExchange;
	private String exchangeRate;

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getOriginCurrency() {
		return originCurrency;
	}

	public void setOriginCurrency(String originCurrency) {
		this.originCurrency = originCurrency;
	}

	public String getDestinationCurrency() {
		return destinationCurrency;
	}

	public void setDestinationCurrency(String destinationCurrency) {
		this.destinationCurrency = destinationCurrency;
	}

	public String getAmountWithExchange() {
		return amountWithExchange;
	}

	public void setAmountWithExchange(String amountWithExchange) {
		this.amountWithExchange = amountWithExchange;
	}

	public String getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(String exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

}
