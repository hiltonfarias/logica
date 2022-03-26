package br.com.supera.logica.segundoDesafio;

import java.math.BigDecimal;

public enum EnumNotes {

	NOTES_HUNDRED(new BigDecimal("100.00")), NOTES_FIFTY(new BigDecimal("50.00")),
	NOTES_TWENTY(new BigDecimal("20.00")), NOTES_TEN(new BigDecimal("10.00")),
	NOTES_FIVE(new BigDecimal("5.00")), NOTES_TWO(new BigDecimal("2.00"));

	public BigDecimal value;

	private EnumNotes(BigDecimal value) {
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
