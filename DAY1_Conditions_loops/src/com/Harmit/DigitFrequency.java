//Program for how many times number is repeated in integer

package com.Harmit;

import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        String input = scanner.nextLine();

        System.out.println("Digit frequencies:");
        for (char digit = '0'; digit <= '9'; digit++) {
            int count = 0;
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == digit) {
                    count++;
                } else if (!Character.isDigit(input.charAt(i))) {
                    System.out.println("Invalid input. Please enter only integers.");
                    return;
                }
            }

            if (count > 0) {
                System.out.println(digit + " repeated " + count + " time(s)");
            }
        }

    }
}
