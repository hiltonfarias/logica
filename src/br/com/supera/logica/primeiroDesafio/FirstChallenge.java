package br.com.supera.logica.primeiroDesafio;

import java.io.File;

public class FirstChallenge {

	public static void main(String[] args) {
		
		File file = new File("src/br/com/supera/logica/primeiroDesafio/input.txt");
		ListOfInteger listOfInteger = new ListOfInteger();
		
		listOfInteger.readInput(file);
		listOfInteger.response();
		
	}

}
