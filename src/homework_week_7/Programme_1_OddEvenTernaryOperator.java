package homework_week_7;

import java.util.Scanner;

/**
 * 1. Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */

public class Programme_1_OddEvenTernaryOperator {

    public static void main(String[] args) {
        // Scanner declaration for reading input form consol
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number:");
        int number = scanner.nextInt();
        isItOddOrEvenNumber(number);
        scanner.close();
    }
    // Checking the number is even or odd
    public static void isItOddOrEvenNumber(int number){
        //ternary operator is used
        String evenOdd = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("the " + number + " is " + evenOdd + "number");
    }
}
