package assignment;

import java.util.Scanner;

public class Assignment34 {

    public static void main(String[] args) {      //prime or not

        int n, i = 2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number");
        n = scanner.nextInt();

            if (n % i == 0) {
                System.out.println("prime number");
            } else {
                System.out.println("Not prime");
            }
        }
    }

