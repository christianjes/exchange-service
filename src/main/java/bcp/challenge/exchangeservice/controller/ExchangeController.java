package bcp.challenge.exchangeservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import bcp.challenge.exchangeservice.bean.ExchangeRQ;
import bcp.challenge.exchangeservice.bean.ExchangeRS;
import bcp.challenge.exchangeservice.model.Exchange;
import bcp.challenge.exchangeservice.repository.ExchangeRepository;

@RestController
public class ExchangeController {
	private ExchangeRepository repository;

	@Autowired
	public ExchangeController(ExchangeRepository repository) {
		this.repository = repository;
	}

	@RequestMapping(value = "/exchanges", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ExchangeRS exchange(@RequestBody ExchangeRQ request) {
		Exchange exchange = repository.findByInputCurrencyAndOutputCurrency(request.getOriginCurrency(),
				request.getDestinationCurrency());
		ExchangeRS response = new ExchangeRS();
		response.setAmount(request.getAmount());
		response.setAmountWithExchange(
				String.valueOf(exchange.getExchangeRate() * (Double.valueOf(request.getAmount()))));
		response.setDestinationCurrency(request.getDestinationCurrency());
		response.setExchangeRate(String.valueOf(exchange.getExchangeRate()));
		response.setOriginCurrency(request.getOriginCurrency());
		return response;
	}


}
