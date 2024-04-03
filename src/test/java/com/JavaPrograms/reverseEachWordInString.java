package com.JavaPrograms;

public class reverseEachWordInString {
	public static void main(String[] args) {
		String str = "Hi How are you doing?";
		String[] words = str.split("\\s");
		String ReverseString = "";
		int count = words.length;
		
		for (String word : words) {
			StringBuilder obj = new StringBuilder(word);
			String reverseWord = "";
			obj.reverse();
			reverseWord = reverseWord + obj.toString() + " ";
			//System.out.println(reverseWord);
			ReverseString = ReverseString + reverseWord + " ";
		}
		System.out.println("Given String:" + str);
		System.out.println("Reverse of given String:" + ReverseString);
	}
}