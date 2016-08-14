package Algorithms.Strings;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class bear_and_steady_gene {

	static java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		int lenght = Integer.parseInt(reader.readLine());
		String input = reader.readLine();
		String rev = new StringBuilder(input).reverse().toString();
		
		int x = getMinLenghtToChange(input);
		int y = getMinLenghtToChange(rev);
		
		System.out.println(Math.min(x, y));

	}
	
	private static int getMinLenghtToChange(String input) {
		int requiredNumber = input.length() / 4;
		
		Map<Character, Integer> map = new HashMap<>();
		
		int start = 0;
		int end = 0;
		
		for (int i = 0; i < input.length(); i++) {
			int number = 1;
			
			if (map.containsKey(input.charAt(i))) {
				number += map.get(input.charAt(i));
			}
			
			if (number <= requiredNumber) {
				map.put(input.charAt(i), number);
			} else {
				start = i;
				break;
			}
			
		}
		
		for (int i = input.length() - 1; i>= 0; i--) {
			int number = 1;
			
			if (map.containsKey(input.charAt(i))) {
				number += map.get(input.charAt(i));
			}
			
			if (number <= requiredNumber) {
				map.put(input.charAt(i), number);
			} else {
				end = i;
				break;
			}
		}
		
		return (end - start + 1);
		
	}

}
