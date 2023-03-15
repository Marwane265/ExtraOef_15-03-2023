package intec.brussel;

public class Oef06 {
    public static void main(String[] args) {
        //Write a program to calculate the sum of first 10 natural number.

        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
            sum += i;
        }
        System.out.println("Sum= " + sum);
    }
}
