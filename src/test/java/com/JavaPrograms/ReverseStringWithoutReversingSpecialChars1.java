package com.JavaPrograms;
import java.util.Stack;
public class ReverseStringWithoutReversingSpecialChars1 {
	public static void main(String[] args) {
		String input = "a&bc!d";
        String output = reverseStringPreservingSpecialChars(input);
        System.out.println(output);  // Output should be "dcb!a"
	}
	public static String reverseStringPreservingSpecialChars(String input) {
        // Step 1: Use a stack to collect all alphabetic characters
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                stack.push(c);
            }
        }
        // Step 2: Build the result string
        StringBuilder result = new StringBuilder(input.length());
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                result.append(stack.pop());
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
}

