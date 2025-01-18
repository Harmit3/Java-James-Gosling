//how to do which is max repeated number in integer

package com.Harmit;

import java.util.Scanner;

import java.util.Scanner;

public class MaxRepeatedNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter an integer: ");
        String input = scanner.nextLine();

        char mostRepeatedDigit = ' ';
        int maxCount = 0;

        // Iterate through digits 0 to 9
        for (char digit = '0'; digit <= '9'; digit++) {
            int count = 0;

            // Count occurrences of the current digit
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == digit) {
                    count++;
                } else if (!Character.isDigit(input.charAt(i))) {
                    System.out.println("Invalid input. Please enter only integers.");
                    return;
                }
            }

            // Update the most repeated digit
            if (count > maxCount) {
                maxCount = count;
                mostRepeatedDigit = digit;
            }
        }

        // Display the result
        if (maxCount > 0) {
            System.out.println("The most repeated digit is " + mostRepeatedDigit + " repeated " + maxCount + " time(s)." );
        } else {
            System.out.println("No digits found.");
        }

    }
}
