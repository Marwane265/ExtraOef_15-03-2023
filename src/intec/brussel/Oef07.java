package intec.brussel;

import java.util.Scanner;

public class Oef07 {
    public static void main(String[] args) {


//        Write a program to find the factorial value of any number entered through the keyboard.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = scanner.nextInt();

        if (num < 0) {
            System.out.println("Dit is een negatief getal en kan dus niet");
        } else {

            int fac = 1;
            for (int index = 1; index <= num; index++) {
                fac *= index;

            }
            System.out.println("Sum total: " + fac);
        }


    }
}
