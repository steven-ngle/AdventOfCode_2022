package days;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Day3 {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws FileNotFoundException {

		BufferedReader bReader;

		String stringLine;
		String firstCompartment = "";
		String secondCompartment = "";
		int sum = 0;
		ArrayList<String> firstCompartmentList = new ArrayList<String>();
		ArrayList<String> secondCompartmentList = new ArrayList<String>();
		
		bReader = new BufferedReader(new FileReader("resources\\day3.txt"));
		
		try {
			while ((stringLine = bReader.readLine()) != null) {
				firstCompartmentList.add(stringLine.substring(0, stringLine.length()/2));
				secondCompartmentList.add(stringLine.substring(stringLine.length()/2, stringLine.length()));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(firstCompartmentList);
		System.out.println(secondCompartmentList);
		
		for (int i = 0; i < firstCompartmentList.size(); i++) {
			firstCompartment = firstCompartmentList.get(i);
			secondCompartment = secondCompartmentList.get(i);
			
			Set<Character> set1 = new HashSet<Character>();
			Set<Character> set2 = new HashSet<Character>();	
			
			for (char c : firstCompartment.toCharArray()) {
				set1.add(c);
			}
			for (char c : secondCompartment.toCharArray()) {
				set2.add(c);
			}
			
			set1.retainAll(set2);
			for (char c : set1) {
				if (Character.isUpperCase(c)) {
					int priorityUpperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".indexOf(c) + 27;
					sum += priorityUpperCase;
				}
				if (Character.isLowerCase(c)) {
					int priorityLowerCase = "abcdefghijklmnopqrstuvwxyz".indexOf(c) + 1;
					sum += priorityLowerCase;
				}
			}
		}
		System.out.println(sum);
		
		// part two
		// to be continued...
	}
}
