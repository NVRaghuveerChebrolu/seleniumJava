package com.JavaPrograms;
import java.util.Arrays;
public class SeperatePositiveAndNegativeNumbers {
    public static void main(String[] args) {
        int[] nums = {5, -7, 10, -3, 0, 8, -2};
        int[][] separated = separatePositiveNegative(nums);
        System.out.println("Positive numbers: " + Arrays.toString(separated[0]));
        System.out.println("Negative numbers: " + Arrays.toString(separated[1]));
    }
    public static int[][] separatePositiveNegative(int[] nums) {
        int positiveCount = 0;
        int negativeCount = 0;
        // Count positive and negative numbers
        for (int num : nums) {
            if (num >= 0) {
                positiveCount++;
            } else {
                negativeCount++;
            }
        }
        // Allocate arrays for positive and negative numbers
        int[] positiveNumbers = new int[positiveCount];
        int[] negativeNumbers = new int[negativeCount];
        // Populate arrays with positive and negative numbers
        int positiveIndex = 0;
        int negativeIndex = 0;
        for (int num : nums) {
            if (num >= 0) {
                positiveNumbers[positiveIndex++] = num;
            } else {
                negativeNumbers[negativeIndex++] = num;
            }
        }
        // Return array of arrays containing positive and negative numbers
        return new int[][]{positiveNumbers, negativeNumbers};
    }
}
