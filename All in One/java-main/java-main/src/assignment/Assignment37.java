package assignment;

import java.util.Scanner;

public class Assignment37 {

    public static void main(String[] args) {

        int number,digit,sum=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number");
        number = scanner.nextInt();

        while (number>0){
            digit = number%10;
            sum = sum + digit;
            number = number/10;
        }
        System.out.println("Sum of digit:"+sum);

    }
}
