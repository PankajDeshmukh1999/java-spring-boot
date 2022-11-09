package Basic;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        int i,fact = 1;

        int number = 5;
        for (i=1;i<=number;i++){
            fact= fact*i;
        }
        System.out.println("Factorial of " +number+ "is "+fact);

//        int i,fact=1,num;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter Number");
//        num= scanner.nextInt();
//
//
//        for (i=1;i<=num;i++){
//            fact = fact*i;
//        }
//        System.out.println("Factorial of "+num+ "is "+fact );
   }
}
