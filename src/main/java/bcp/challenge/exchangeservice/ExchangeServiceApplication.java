package bcp.challenge.exchangeservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import bcp.challenge.exchangeservice.constant.ExchangeConstants;
import bcp.challenge.exchangeservice.model.Exchange;
import bcp.challenge.exchangeservice.repository.ExchangeRepository;

@SpringBootApplication
public class ExchangeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExchangeServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner initDatabase(ExchangeRepository repository) {
		return args -> {
			repository.save(new Exchange(ExchangeConstants.DOLAR_AMERICANO, ExchangeConstants.SOL, 3.39));
			repository.save(new Exchange(ExchangeConstants.EURO, ExchangeConstants.SOL, 3.75));
		};
	}

}
