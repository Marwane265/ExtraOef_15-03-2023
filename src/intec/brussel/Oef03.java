package intec.brussel;

import java.util.Scanner;

public class Oef03 {
    public static void main(String[] args) {

        //Write a Java program to find the number of days in a month.

        System.out.println("Give the number of the month so: 1=January, 2=February,...");


        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();


        switch (month) {
            case 1:
                System.out.println("This month has 31 days");
                break;
            case 2:
                System.out.println("This month has 28 days");
                break;
            case 3:
                System.out.println("This month has 31 days");
                break;
            case 4:
                System.out.println("This month has 30 days");
                break;
            case 5:
                System.out.println("This month has 31 days");
                break;
            case 6:
                System.out.println("This month has 30 days");
                break;
            case 7:
                System.out.println("This month has 31 days");
                break;
            case 8:
                System.out.println("This month has 30 days");
                break;
            case 9:
                System.out.println("This month has 31 days");
                break;
            case 10:
                System.out.println("This month has 30 days");
                break;
            case 11:
                System.out.println("This month has 31 days");
                break;
            case 12:
                System.out.println("This month has 30 days");
                break;
            default:
                System.out.println("Not a valid number");


        }


    }
}
