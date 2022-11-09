package assignment;

import java.util.Scanner;

public class Assignment27 {

    public static void main(String[] args) {

        int year = 365;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter days of year:");
        year = scanner.nextInt();

        if (year!=366){
            System.out.println("Not leap year");
        }else {
            System.out.println("leap year");
        }

    }
}
