package com.JavaPrograms;

public class ReverseStringWithoutReversingSpecialChars2 {
	public static void main(String[] args) {
		String input = "ab&c!d";
		String output = reverseStringPreservingSpecialChars(input);
		System.out.println(output); // Output should be "dcb!a"
	}
	public static String reverseStringPreservingSpecialChars(String input) {
		// Step 1: Extract alphabetic characters and reverse them
		char[] chars = input.toCharArray();
		char[] result = new char[chars.length];
		int j = 0;
		// Collect all alphabetic characters in a temporary array
		for (char c : chars) {
			if (Character.isLetter(c)) {
				result[j++] = c;
			}
		}
		// Reverse the collected alphabetic characters
		for (int i = 0; i < j / 2; i++) {
			char temp = result[i];
			result[i] = result[j - 1 - i];
			result[j - 1 - i] = temp;
		}
		// Step 2: Reinsert non-alphabetic characters into their original positions
		int alphaIndex = 0;
		for (int i = 0; i < chars.length; i++) {
			if (Character.isLetter(chars[i])) {
				chars[i] = result[alphaIndex++];
			}
		}
		return new String(chars);
	}
}
