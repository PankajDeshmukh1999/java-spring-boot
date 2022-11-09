package assignment;

import java.util.Scanner;

public class Assignment11 {

    public static void main(String[] args) {

        int c,f;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Celsius");
        c= scanner.nextInt();

        f= c*(9/5)+32;

        System.out.println(" Fahrenheit is :"+f);

    }

}
