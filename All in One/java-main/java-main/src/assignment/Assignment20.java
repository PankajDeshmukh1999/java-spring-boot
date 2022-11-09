package assignment;

import java.util.Scanner;

public class Assignment20 {

    public static void main(String[] args) {

        int num1,num2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num1");
        num1= scanner.nextInt();
        System.out.println("Enter num2");
        num2= scanner.nextInt();

        if (num1>num2){
            System.out.println("num1 is maximum "+" num2 is minimum");
        }else if (num1<num2){
            System.out.println("num2 is maximum "+ " and "+" num1 is minimum");
        }else{
            System.out.println("both are equals");
        }

    }
}
