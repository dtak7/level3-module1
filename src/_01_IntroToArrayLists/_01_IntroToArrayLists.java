package _01_IntroToArrayLists;

import java.util.ArrayList;
import java.util.concurrent.SynchronousQueue;

public class _01_IntroToArrayLists {
	public static void main(String[] args) {
		// 1. Create an array list of Strings
		// Don't forget to import the ArrayList class
		ArrayList<String> names = new ArrayList<String>();
		// 2. Add five Strings to your list
		names.add("D");
		names.add("A");
		names.add("N");
		names.add("I");
		names.add("E");
		names.add("L");
		// 3. Print all the Strings using a standard for-loop
		for (int i = 0; i < names.size(); i++) {
			String n = names.get(i);
			System.out.println(n);
		}
		System.out.println("");

		// 4. Print all the Strings using a for-each loop
		for (String n : names) {
			System.out.println(n);
		}
		System.out.println("");
		// 5. Print only the even numbered elements in the list.
		for (int i = 0; i < names.size(); i += 2) {
			String n = names.get(i);
			System.out.println(n);
		}
		System.out.println("");
		// 6. Print all the Strings in reverse order.
		for (int i =names.size()-1; i>-1;i-- ) {
			String n =names.get(i);
			System.out.println(n);
		}
		System.out.println("");
		// 7. Print only the Strings that have the letter 'e' in them.
		for (int i = 0; i < names.size(); i++) {
			charAt("e");
		}
	}

	private static void charAt(String string) {
		// TODO Auto-generated method stub
		
	}
}
