package bcp.challenge.exchangeservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Exchange {
	@Id
	@GeneratedValue
	private Long id;
	private String inputCurrency;
	private String OutputCurrency;
	private float rate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getInputCurrency() {
		return inputCurrency;
	}

	public void setInputCurrency(String inputCurrency) {
		this.inputCurrency = inputCurrency;
	}

	public String getOutputCurrency() {
		return OutputCurrency;
	}

	public void setOutputCurrency(String outputCurrency) {
		OutputCurrency = outputCurrency;
	}

	public float getRate() {
		return rate;
	}

	public void setRate(float rate) {
		this.rate = rate;
	}

}
