package br.com.supera.logica.terceiroDesafio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;

public class CriterionPairs {

	private int[] integers;
	private Integer target;
	private Integer sizeArray;

	public void readInput(File inputFile) {
		BufferedReader bufferedReader = null;
		String[] firstLine = new String[2];
		try {
			bufferedReader = new BufferedReader(new FileReader(inputFile));
			firstLine = bufferedReader.readLine().split(" ");
			this.sizeArray = Integer.parseInt(firstLine[0]);
			this.target = Integer.parseInt(firstLine[1]);
			this.integers = new int[this.target];
			this.integers = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public int numberOfPair() {
		int count = 0;
		for (int i = 0; i < this.sizeArray; i++) {
			for (int j = 0; j < this.sizeArray; j++) {
				if (this.difference(this.integers[i], this.integers[j]) == this.target) {
					count++;
				}
			}
		}
		return count;
	}

	private Integer difference(Integer value1, Integer value2) {
		return value1 - value2;
	}
}
