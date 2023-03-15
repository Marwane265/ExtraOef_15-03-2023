package intec.brussel;

import java.util.Scanner;

public class Oef02 {
    public static void main(String[] args) {

        //Write a Java program that reads an integer and check whether it is negative, zero, or positive.

        System.out.println("Write a number");
        Scanner scanner = new Scanner(System.in);
        int nummer = scanner.nextInt();


        if (nummer < 0) {
            System.out.println("This is negative");

        } else if (nummer == 0) {
            System.out.println("This is equals zero");
        } else {
            System.out.println("This is positive");
        }


    }
}
