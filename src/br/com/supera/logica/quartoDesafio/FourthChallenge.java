package br.com.supera.logica.quartoDesafio;

import java.io.File;

public class FourthChallenge {

	public static void main(String[] args) {
		
		File file = new File("src/br/com/supera/logica/quartoDesafio/input.txt");
		SortString sortString = new SortString();
		
		sortString.readInput(file);
		sortString.sorting();
	}

}
