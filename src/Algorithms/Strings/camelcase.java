package Algorithms.Strings;

import java.util.Scanner;

public class camelcase {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        
        System.out.println(countWords(input));
	}
	
	private static int countWords(String input) {
		int number = 1;
		
		for (int i = 1; i < input.length(); i++) {
			if (Character.isUpperCase(input.charAt(i))) {
				number++;
			}
		}
		
		return number;
	}

}
