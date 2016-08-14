package Algorithms.Strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Pangrams {
	
	private static StreamTokenizer inputReader = new StreamTokenizer(
			new BufferedReader(new InputStreamReader(System.in)));

	private static Scanner scaner = new Scanner(System.in);

	static java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

	public static int nextInt() {
		int a = -1;
		try {
			inputReader.nextToken();
			a = (int) inputReader.nval;
		} catch (Exception e) {
		}
		return a;
	}

	public static void main(String[] args) throws IOException {
		String input = reader.readLine();
		
		
		Set<Character> usedChars = new HashSet<>();
		
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			
			if (Character.isAlphabetic(ch)) {
				usedChars.add(Character.toLowerCase(ch));
			}
		}
		
		if (usedChars.size() == 26) {
			System.out.println("pangram");
		} else {
			System.out.println("not pangram");
		}

	}

}
