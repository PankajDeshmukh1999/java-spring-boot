package assignment;

import java.util.Scanner;

public class Assignment30 {

    public static void main(String[] args) {   //power of number

        int base, exponent;
        long power = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter base");
        base = scanner.nextInt();
        System.out.println("Enter exponent");
        exponent = scanner.nextInt();

        while (exponent != 0) {
            power = power * base;
            --exponent;

        }
        System.out.println(base + " to the power " + exponent + " is: " + power);
    }
}