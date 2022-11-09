package assignment;

import java.util.Scanner;

public class Assignment6 {

    public static void main(String[] args) {

        int num1,num2,n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num1");
        num1= scanner.nextInt();
        System.out.println("Enter num2");
        num2 = scanner.nextInt();

        n = num1/num2;
        System.out.println(n);

    }
}
