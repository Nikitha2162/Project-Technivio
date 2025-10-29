package com.example.controlstatements;

import java.util.Scanner;

public class ControlStatementsDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Java Control Statements Demo ===");
        System.out.print("Enter a number between 1 and 5: ");
        int number = scanner.nextInt();

        // if-else statement
        if (number == 1) {
            System.out.println("You entered ONE.");
        } else if (number == 2) {
            System.out.println("You entered TWO.");
        } else if (number == 3) {
            System.out.println("You entered THREE.");
        } else {
            System.out.println("Number is greater than 3 or invalid.");
        }

        // switch statement
        switch (number) {
            case 4:
                System.out.println("Switch: You entered FOUR.");
                break;
            case 5:
                System.out.println("Switch: You entered FIVE.");
                break;
            default:
                System.out.println("Switch: Not in range 4-5.");
        }

        // for loop
        System.out.println("\nFor Loop: Counting 1 to 5");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);
        }

        // while loop
        System.out.println("\nWhile Loop: Counting down from 3");
        int count = 3;
        while (count > 0) {
            System.out.println("Countdown: " + count);
            count--;
        }

        // do-while loop
        System.out.println("\nDo-While Loop: Will run at least once");
        int x = 0;
        do {
            System.out.println("x = " + x);
            x++;
        } while (x < 3);

        System.out.println("\nDemo Completed!");
        scanner.close();
    }
}
