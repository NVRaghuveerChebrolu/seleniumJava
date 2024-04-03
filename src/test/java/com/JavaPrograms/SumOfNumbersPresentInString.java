package com.JavaPrograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SumOfNumbersPresentInString {

	public static void main(String[] args) {
        String input = "abc123def456ghi789"; // Example string containing numbers
        int sum = sumOfNumbers(input);
        System.out.println("Sum of numbers in the string: " + sum);
    }

    public static int sumOfNumbers(String input) {
        int sum = 0;
        Pattern pattern = Pattern.compile("-?\\d+"); // Regular expression to match integers
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            sum += Integer.parseInt(matcher.group());
        }
        return sum;
    }
//    Let's break down the regular expression "-?\\d+" used in the Pattern.compile method:
//    -?: This part of the regular expression matches an optional hyphen (-). 
//    The question mark (?) denotes that the hyphen may appear zero or one time. 
//    So, this part allows for matching negative numbers if they are present in the string. If the hyphen is not present, it means the number is positive.
    
//    \\d+: This part of the regular expression matches one or more digits (\d). 
//    The backslash (\) is an escape character in Java strings, and it's used here to escape the d, which represents any digit. 

//    The + indicates that there should be at least one digit, but potentially more.
//    So, altogether, the regular expression "-?\\d+" matches any sequence of characters that represents a number, 
//    whether positive or negative, within the string.
}
