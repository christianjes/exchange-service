package bcp.challenge.exchangeservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Exchange {
	@Id
	@GeneratedValue
	private Long id;
	private String originCurrency;
	private String destinationCurrency;
	private double exchangeRate;

	public Exchange() {

	}

	public Exchange(String originCurrency, String destinationCurrency, double exchangeRate) {
		super();
		this.originCurrency = originCurrency;
		this.destinationCurrency = destinationCurrency;
		this.exchangeRate = exchangeRate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public double getExchangeRate() {
		return exchangeRate;
	}

	public void setRate(double exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

}
