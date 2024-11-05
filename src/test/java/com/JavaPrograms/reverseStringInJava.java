package com.JavaPrograms;

public class reverseStringInJava {
	public static void main(String args[]) {
		String str1 = "Shiksha Online";
		System.out.println("Original string: " + str1);
		int n = str1.length(); // caclulates length of String
		String Reverse_String = "";
		char ch;
		for (int i = 0; i < n; i++) {
			// fetch each character
			ch = str1.charAt(i);
			// concatenates each character in front of the new string
			Reverse_String = ch + Reverse_String;
		}
		System.out.println("Reversed string: " + Reverse_String); // Display the reversed String
	}
}
