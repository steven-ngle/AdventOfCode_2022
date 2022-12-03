package days;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Day1 {

	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		BufferedReader bReader;

		bReader = new BufferedReader(new FileReader("resources\\calories.txt"));

		String stringLine;
		
		int sum = 0;

		ArrayList<Integer> list = new ArrayList<Integer>();

		try {
			while ((stringLine = bReader.readLine()) != null) {

				if (stringLine.matches("[0-9]+")){
					sum = sum + Integer.parseInt(stringLine);
				} else {
					list.add(sum);
					sum = 0;
				}
				
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch bloc
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		System.out.println(list);
		
        System.out.println(Collections.max(list));
		
	}

}