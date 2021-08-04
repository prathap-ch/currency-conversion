package com.skillUp.currencyconversion.beans;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CurrencyConversion {
	@Id
	private int id;
	private String currencyFrom;
	private String currencyTo;
	private BigDecimal conversionMultiple;
	private BigDecimal totalCalulatedAmount;
	private String environment;

	public CurrencyConversion() {
		super();
	}

	public CurrencyConversion(int id, String currencyFrom, String currencyTo, BigDecimal conversionMultiple,
			BigDecimal totalCalulatedAmount, String environment) {
		super();
		this.id = id;
		this.currencyFrom = currencyFrom;
		this.currencyTo = currencyTo;
		this.conversionMultiple = conversionMultiple;
		this.totalCalulatedAmount = totalCalulatedAmount;
		this.environment = environment;
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

	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}

	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}

	public BigDecimal getTotalCalulatedAmount() {
		return totalCalulatedAmount;
	}

	public void setTotalCalulatedAmount(BigDecimal totalCalulatedAmount) {
		this.totalCalulatedAmount = totalCalulatedAmount;
	}

}
