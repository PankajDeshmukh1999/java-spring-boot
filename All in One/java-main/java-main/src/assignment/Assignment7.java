package assignment;

import java.util.Scanner;

public class Assignment7 {

    public static void main(String[] args) {

        int num1,num2, sum,mul,div,reminder;
        Scanner scanner  =  new Scanner(System.in);
        System.out.println("Enter number 1");
        num1 = scanner.nextInt();
        System.out.println("Enter number 2");
        num2 = scanner.nextInt();
                //formula
        sum = num1+num2;
        mul = num1*num2;
        div = num1/num2;
        reminder = num1%num2;

        System.out.println("Number of sum:"+sum);
        System.out.println("Number of multiplication:"+mul);
        System.out.println("Number of division:"+div);
        System.out.println("Number of reminder:"+reminder);


    }
}
