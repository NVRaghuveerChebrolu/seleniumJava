package com.JavaPrograms;

public class ReverseOnlyLongestWordsInString {

	public static void main(String[] args) {
        String input = "My name is Praveen. I am playing game";
        String output = reverseLongestWords(input);
        System.out.println(output);
    }

    public static String reverseLongestWords(String input) {
        String[] words = input.split(" ");
        int maxLength = 0;

        // Find the length of the longest word(s)
        for (String word : words) {
            String cleanWord = word.replaceAll("[^a-zA-Z]", ""); // Removing punctuation
            if (cleanWord.length() > maxLength) {
                maxLength = cleanWord.length();
            }
        }

        StringBuilder result = new StringBuilder();

        // Reverse the longest word(s) and reconstruct the sentence
        for (String word : words) {
            String punctuation = "";
            String cleanWord = word;

            // Check for punctuation at the end of the word
            if (word.endsWith(".") || word.endsWith(",")) {
                punctuation = word.substring(word.length() - 1);
                cleanWord = word.substring(0, word.length() - 1);
            }

            // Reverse the word if it matches the maxLength
            if (cleanWord.length() == maxLength) {
                cleanWord = new StringBuilder(cleanWord).reverse().toString();
            }

            result.append(cleanWord).append(punctuation).append(" ");
        }

        // Remove the trailing space
        return result.toString().trim();
    }

}
