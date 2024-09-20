package com.JavaPrograms;
import java.util.Scanner;
public class VowelsInGivenString {
	public static void main(String[] args) {
		// Input
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String inputString = scanner.nextLine();
		// Convert the input string to lowercase to simplify vowel check
		inputString = inputString.toLowerCase();
		// Count and output vowels
		int count = 0;
		System.out.print("Vowels in the string: ");
		for (int i = 0; i < inputString.length(); i++) {
			char ch = inputString.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				System.out.print(ch + " ");
				count++;
			}
		}
		System.out.println("\nTotal number of vowels: " + count);
		scanner.close();
	}
}
