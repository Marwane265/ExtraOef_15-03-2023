package intec.brussel;

import java.util.Scanner;

public class Oef01 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        while(true) {

            System.out.println("Give me three numbers and i will tell you if they are equal, not equal or neither.");
            System.out.print("Input first number: ");
            int num01 = scanner.nextInt();
            System.out.print("Input second number: ");
            int num02 = scanner.nextInt();
            System.out.print("Input third number: ");
            int num03 = scanner.nextInt();


            if (num01 == num02 && num01 == num03) {
                System.out.println("This is equal");
            } else if (num01 == num02 && num01 != num03) {
                System.out.println("Only the first number you gave in, equals the second number");
            } else if (num01 != num02 && num01 == num03) {
                System.out.println("Only the first number you gave in, equals the third number");
            } else {
                System.out.println("Nothing is equal");
            }

            // word gedaan ivm nextInt() kan je niet nextLine() vragen fout in scanner class
            scanner.nextLine();

            System.out.println("Again? y or n");
            String yesOrNo = scanner.nextLine();

            if (yesOrNo.equalsIgnoreCase("n")) {

                break;
            }

        }
    }
}
