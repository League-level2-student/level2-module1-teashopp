package _00_intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList (java.util) class
		ArrayList<String> string = new ArrayList<String>();

		//2. Add five Strings to your list
		string.add("one");
		string.add("two");
		string.add("three");
		string.add("four");
		string.add("five");
		
		//3. Print all the Strings using a standard for-loop
		for (int i = 0; i < 5; i++) {
			String s = string.get(i);
			System.out.println(s);
		}
		
		System.out.println("");
		
		//4. Print all the Strings using a for-each loop
		for (String s : string) {
			System.out.println(s);
		}
		
		System.out.println("");
		
		//5. Print only the even numbered elements in the list.
		for (int j = 0; j < 5; j++) {
			if (j % 2 == 0) {
				String s = string.get(j);
				System.out.println(s);
			}
		}
		
		System.out.println("");
		
		//6. Print all the Strings in reverse order.
		for (int i = 4; i >= 0; i--) {
			String s = string.get(i);
			System.out.println(s);
		}
		
		System.out.println("");
		
		//7. Print only the Strings that have the letter 'e' in them.
		for (int j = 0; j < args.length; j++) {
			if (string.contains("e")) {
				String s = string.get(j);
				System.out.println(s);
			}
		}
		
		System.out.println("");
		System.out.println("end");
		
	}
}
