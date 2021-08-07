package com.skillUp.currencyconversion.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.skillUp.currencyconversion.beans.CurrencyConversion;

//@FeignClient(name = "currency-exchange", url = "localhost:8000")
@FeignClient(name = "currency-exchange") // no need to add url once we done with Eureka server configuration
public interface CurrencyExchangeProxy {
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyConversion retrieveExchangeValue(@PathVariable String from, @PathVariable String to);
}
