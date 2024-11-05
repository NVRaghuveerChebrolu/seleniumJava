package com.JavaPrograms;
public class RetriveExpensiveProducts {
    public static void main(String[] args) {
        String[] products = {"iPhone 11", "Galaxy", "Pixel 4", "iPhone 8"};
        int[] price = {700, 650, 899, 284};
        // Find the index of the most expensive product
        int maxIndex = getMaxPriceIndex(price);
        // Retrieve the most expensive product
        String mostExpensiveProduct = products[maxIndex];
        System.out.println("The most expensive product is: " + mostExpensiveProduct);
    }
    // Function to find the index of the maximum value in an array
    public static int getMaxPriceIndex(int[] price) {
        int maxIndex = 0;
        int maxValue = price[0];
        for (int i = 1; i < price.length; i++) {
            if (price[i] > maxValue) {
                maxValue = price[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
