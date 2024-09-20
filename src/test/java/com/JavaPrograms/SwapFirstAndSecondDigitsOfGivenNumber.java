package com.JavaPrograms;
import java.util.Scanner;
public class SwapFirstAndSecondDigitsOfGivenNumber {
	public static void main(String[] args) {
		// Input
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		// Convert number to string for manipulation
		String numStr = Integer.toString(number);
		// Check if the number has at least two digits
		if (numStr.length() >= 2) {
			// Swap the first and second digits
			char[] digits = numStr.toCharArray();
			char temp = digits[0];
			digits[0] = digits[1];
			digits[1] = temp;
			// Convert back to integer
			int result = Integer.parseInt(new String(digits));
			// Output
			System.out.println("Output: " + result);
		} else {
			System.out.println("The number must have at least two digits.");
		}
		scanner.close();
	}
}
