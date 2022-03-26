package br.com.supera.logica.quartoDesafio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortString {

	private Integer n;
	private List<String> list = new ArrayList<>();
	
	public void readInput(File inputFile) {
		BufferedReader bufferedReader = null;
		try {
			bufferedReader = new BufferedReader(new FileReader(inputFile));
			this.n = Integer.parseInt(bufferedReader.readLine());
			for (int i = 0; i < this.n; i++) {
				this.list.add(bufferedReader.readLine());
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public void sorting() {
		List<Character> listCharIni = new ArrayList<>();
		List<Character> listCharFin = new ArrayList<>();
		for (String string : this.list) {
			char[] charLine = string.toCharArray();
			for (int i = 0; i < charLine.length/2; i++) {
				listCharIni.add(charLine[i]);
				listCharFin.add(charLine[charLine.length/2 + i]);
			}
			Collections.reverse(listCharIni);
			Collections.reverse(listCharFin);
			StringBuilder response = new StringBuilder();
			this.composeString(listCharIni, response);
			this.composeString(listCharFin, response);
			
			System.out.println(response);
			listCharIni.clear();
			listCharFin.clear();
		}
	}
	private StringBuilder composeString(List<Character> listCharacter, StringBuilder stringBuilder) {
		for (Character character : listCharacter) {
			stringBuilder.append(character);
		}
		return stringBuilder;
	}
}
