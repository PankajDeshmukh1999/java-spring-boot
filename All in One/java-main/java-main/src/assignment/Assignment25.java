package assignment;

import java.util.Scanner;
public class Assignment25 {     // simple calculator

    public static void main(String[] args) {

        double num1,num2,op = 0;
        char ch;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number 1:");
        num1 = scanner.nextDouble();
        System.out.println("Enter Number 2:");
        num2 = scanner.nextDouble();

        ch = scanner.next().charAt(0);

        switch (ch){
            case '+' :
                op = num1+num2;
                break;
            case '-' :
                op = num1-num2;
                break;
            case '*' :
                op = num1*num2;
                break;
            case '/' :
                op = num1/num2;
                break;
            case '%' :
                op = num1%num2;
                break;
            default :
                System.out.println("invalid");
        }

        System.out.println(num1 + " " +ch + " " + num2 + " = " + op);
    }
}
