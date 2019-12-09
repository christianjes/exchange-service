package bcp.challenge.exchangeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import bcp.challenge.exchangeservice.model.Exchange;

public interface ExchangeRepository extends JpaRepository<Exchange, Long> {

	@Query(value = "SELECT * FROM Exchange e WHERE e.origincurrency = ?1 AND e.destinationcurrency= ?2", nativeQuery = true)
	public Exchange findByInputCurrencyAndOutputCurrency(String inputCurrency, String outputCurrency);

}
