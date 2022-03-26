package br.com.supera.logica.primeiroDesafio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ListOfInteger {
	private Integer n;
	private List<Integer> myList = new ArrayList<>();
	
	public Integer getN() {
		return n;
	}
	
	public void readInput(File fileInput) {
		BufferedReader bufferedReader = null;
		try {
			bufferedReader = new BufferedReader(new FileReader(fileInput));
			this.n = Integer.parseInt(bufferedReader.readLine());
			while (bufferedReader.ready()) {
				this.myList.add(Integer.parseInt(bufferedReader.readLine()));				
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public void response() {
		
		List<Integer> odd = new ArrayList<>();
		for (Integer integer : this.myList) {
			if (!this.isEven(integer)) {
				odd.add(integer);
			}
		}
		this.removeItems(odd);
		Collections.sort(odd, new Comparator<Integer>() {
			@Override
			public int compare(Integer arg0, Integer arg1) {
				return arg0 > arg1 ? -1 : (arg0 < arg1)? 1 : 0;
			}
		});
		Collections.sort(this.myList);
		this.myList.addAll(odd);
		for (Integer integer : this.myList) {
			System.out.println(integer);
		}
	}
	
	private boolean isEven(Integer integer) {
		if (integer % 2 == 0) {
			return true;
		}
		return false;
	}
	
	private void removeItems(List<Integer> items) {
		Iterator<Integer> iterator = this.myList.iterator();
		while (iterator.hasNext()) {
			Integer element = iterator.next();
			for (Integer integer : items) {
				if (integer == element) {
					iterator.remove();
				}
			}
		}
	}
}
