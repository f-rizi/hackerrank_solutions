package Algorithms.Strings;

import java.io.IOException;

public class BeautifulBinaryString {

	static java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		String number = reader.readLine();
		String input = reader.readLine();
		
		System.out.println(getMinSteps(input));
	}
	
	private static int getMinSteps(String input) {
		if (input == null || input.equals("")) {
			return 0;
		}
		
		if (input.startsWith("010")) {
			String s1 = "1" + input.substring(1);
			String s2 = "00" + input.substring(2);
			String s3 = "011" + input.substring(3);
			
			int a1 = getMinSteps(s1);
			int a2 = getMinSteps(s2);
			int a3 = getMinSteps(s3);
			
			return Math.min(Math.min(a1, a2), a3) + 1;
		} 
		
		return getMinSteps(input.substring(1));
	}

}
