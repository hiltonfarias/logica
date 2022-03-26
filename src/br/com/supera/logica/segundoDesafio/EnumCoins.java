package br.com.supera.logica.segundoDesafio;

import java.math.BigDecimal;

public enum EnumCoins {

	COIN_ONE(new BigDecimal("1.00")), COIN_FIFTY_CENTS(new BigDecimal("0.50")),
	COIN_TWENTY_FIVE_CENTS(new BigDecimal("0.25")), COIN_TEN_CENTS(new BigDecimal("0.10")),
	COIN_FIVE_CENTS(new BigDecimal("0.05")), COIN_ONE_CENTS(new BigDecimal("0.01"));

	public BigDecimal value;

	private EnumCoins(java.math.BigDecimal value) {
		this.value = value;
	}

	public BigDecimal getValue() {
		return value;
	}
	
	@Override
	public String toString() {
		
		return this.getValue().toString();
	}
}
