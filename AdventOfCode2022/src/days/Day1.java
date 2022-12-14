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
		bReader = new BufferedReader(new FileReader("resources\\day1.txt"));
		String stringLine;
		int sum = 0;

		ArrayList<Integer> list = new ArrayList<Integer>();

		
		try {
			while ((stringLine = bReader.readLine()) != null) {

				if (stringLine.matches("[0-9]+")){
					sum += Integer.parseInt(stringLine);
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
		
        System.out.println(Collections.max(list));
        
        // part two
        
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        
        for (int i = 0; i < 3; i++) {
        	list2.add(Collections.max(list));
        	list.remove(Collections.max(list));
        }
        
        int sum2 = 0;
        for(int i = 0; i < list2.size(); i++)
            sum2 += list2.get(i);
//        System.out.println(list2);
        System.out.println(sum2);
	}

}