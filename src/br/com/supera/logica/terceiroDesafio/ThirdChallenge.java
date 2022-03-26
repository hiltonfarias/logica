package br.com.supera.logica.terceiroDesafio;

import java.io.File;

public class ThirdChallenge {

	public static void main(String[] args) {
		
		File file = new File("src/br/com/supera/logica/terceiroDesafio/input.txt");
		CriterionPairs criterionPairs = new CriterionPairs();
		
		criterionPairs.readInput(file);
		System.out.println(criterionPairs.numberOfPair());
	}
}
