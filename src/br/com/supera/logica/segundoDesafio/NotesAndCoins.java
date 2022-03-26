package br.com.supera.logica.segundoDesafio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class NotesAndCoins {
	
	private EnumNotes enumNotes;
	private EnumCoins enumCoins;
	private BigDecimal number = BigDecimal.ZERO;
		
	public void readInput(File fileInput) {
		BufferedReader bufferedReader = null;
		try {
			bufferedReader = new BufferedReader(new FileReader(fileInput));
			this.number = new BigDecimal(bufferedReader.readLine());
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	@SuppressWarnings("static-access")
	public void response() {
		
		ArrayList<EnumNotes> listEnumNotes = new ArrayList<EnumNotes>(Arrays.asList(this.enumNotes.values()));
		ArrayList<EnumCoins> listEnumCoins = new ArrayList<EnumCoins>(Arrays.asList(this.enumCoins.values()));
		
		System.out.println("NOTAS:");
		
		for (EnumNotes enumNote : listEnumNotes) {
			EnumNotes note = enumNote;
			int value = this.number.divide(note.getValue()).intValue();
			this.printNumber(note, value);		
			this.updateValue(note, value);			
		}
		
		System.out.println("MOEDAS:");
		
		for (EnumCoins enumCoin : listEnumCoins) {
			EnumCoins coin = enumCoin;
			int value = this.number.divide(coin.getValue()).intValue();
			this.printNumber(coin, value);		
			this.updateValue(coin, value);
		}
			
	}

	private void updateValue(EnumNotes en, int value) {
		this.number = this.number.subtract(en.getValue().multiply(new BigDecimal(value), MathContext.UNLIMITED));
	}
	private void updateValue(EnumCoins en, int value) {
		this.number = this.number.subtract(en.getValue().multiply(new BigDecimal(value), MathContext.UNLIMITED));
	}

	private void printNumber(EnumNotes en, int value) {
		String print = String.format("%-7d ",value)+String.format(Locale.US ,"%1$s       %2$s       %3$s       %4$7.2f\n", "nota(s)", "de", "R$", en.getValue().doubleValue());
		System.out.printf(print);
	}
	private void printNumber(EnumCoins en, int value) {
		String print = String.format("%-7d ",value)+String.format(Locale.US ,"%1$s       %2$s       %3$s       %4$7.2f\n", "moeda(s)", "de", "R$", en.getValue().doubleValue());		
		System.out.printf(print);
	}
	
}
