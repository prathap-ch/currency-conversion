package com.skillUp.currencyconversion.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConversionController {

	@GetMapping("/currency-conversion/from/{from}/to/{to}/quantity/{quantity}")
	public void currencyConverter(@PathVariable String from, @PathVariable String to, @PathVariable int quantity) {
	
	}
}
