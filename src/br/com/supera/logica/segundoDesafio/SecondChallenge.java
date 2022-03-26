package br.com.supera.logica.segundoDesafio;

import java.io.File;

public class SecondChallenge {

	public static void main(String[] args) {
		File file = new File("src/br/com/supera/logica/segundoDesafio/input.txt");
		NotesAndCoins notesAndCoins = new NotesAndCoins();
		
		notesAndCoins.readInput(file);
		notesAndCoins.response();
	}
}
