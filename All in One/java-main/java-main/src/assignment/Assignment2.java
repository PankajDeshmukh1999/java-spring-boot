package assignment;

import java.util.Scanner;

public class Assignment2 {

    public static void main(String[] args) {

//        int sum,n1=10,n2=20;
//        sum= n1+n2;
//        System.out.println(sum);

        int sum,n1,n2;;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter Number n1:");
        n1 = scanner.nextInt();
        System.out.println("Enter Number n2:");
        n2= scanner.nextInt();

        sum=n1+n2;
        System.out.println(sum);

    }

}
