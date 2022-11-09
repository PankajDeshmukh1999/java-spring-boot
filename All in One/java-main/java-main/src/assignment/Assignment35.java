package assignment;

import java.util.Scanner;

public class Assignment35 {
    public static void main(String[] args) {

        int i,fact,num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number");
        num= scanner.nextInt();
        System.out.println("Enter fact");
        fact = scanner.nextInt();

        for (i=1;i<=num;i++){
            fact = fact*i;
        }
        System.out.println("Factorial of "+num+ "is "+fact );

    }
}
