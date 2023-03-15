package intec.brussel;

import java.util.Scanner;

public class Oef04 {
    public static void main(String[] args) {

//        Write a program that accepts three numbers from the user and prints "increasing" if the numbers are in increasing order, "decreasing" if
//        the numbers are in decreasing order, and "Neither increasing or decreasing order" otherwise.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me three numbers and i will tell you if they are increasing, decreasing or neither.");
        System.out.print("Input first number: ");
        int num01 = scanner.nextInt();
        System.out.print("Input second number: ");
        int num02 = scanner.nextInt();
        System.out.print("Input third number: ");
        int num03 = scanner.nextInt();

        if (num01 < num02 && num02 < num03) {
            System.out.println("Increasing");
        } else if (num01 > num02 && num02 > num03) {
            System.out.println("Decreasing");
        } else {
            System.out.println("Neither");
        }


    }
}
