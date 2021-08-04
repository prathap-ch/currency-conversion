package com.skillUp.currencyconversion.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CurrencyConversion {
	@Id
	private int id;
	private String currencyFrom;
	private String currencyTo;
	private int conversionMultiple;
	private Long totalCalulatedAmount;
	private String environment;

	public CurrencyConversion() {
		super();
	}


	public CurrencyConversion(int id, String currencyFrom, String currencyTo, int conversionMultiple) {
		super();
		this.id = id;
		this.currencyFrom = currencyFrom;
		this.currencyTo = currencyTo;
		this.conversionMultiple = conversionMultiple;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCurrencyFrom() {
		return currencyFrom;
	}

	public void setCurrencyFrom(String currencyFrom) {
		this.currencyFrom = currencyFrom;
	}

	public String getCurrencyTo() {
		return currencyTo;
	}

	public void setCurrencyTo(String currencyTo) {
		this.currencyTo = currencyTo;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}

	public int getConversionMultiple() {
		return conversionMultiple;
	}

	public void setConversionMultiple(int conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}

	public Long getTotalCalulatedAmount() {
		return totalCalulatedAmount;
	}

	public void setTotalCalulatedAmount(Long totalCalulatedAmount) {
		this.totalCalulatedAmount = totalCalulatedAmount;
	}

}
