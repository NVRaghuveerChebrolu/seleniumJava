package com.JavaPrograms;
import java.util.Arrays;
public class sortIndescendingOrder {
    public static void main(String[] args) {
        // Define an array of numbers
        int[] numbers = {5, 2, 9, 1, 3};

        // Sort the array in descending order
        Arrays.sort(numbers);

        // Reverse the sorted array
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }

        // Print the sorted array
        System.out.println("Sorted numbers in descending order:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
