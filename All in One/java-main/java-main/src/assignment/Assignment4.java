package assignment;

import java.util.Scanner;

public class Assignment4 {

    public static void main(String[] args) {
//swap  two numbers
//        int c,a=10,b=20;
//
//        c=a;
//        a=b;
//        b=c;
//
//        System.out.println("after swap a:"+a);
//        System.out.println("after swap b:"+b);

        int a,b,c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter value of a");
        a = scanner.nextInt();
        System.out.println("enter value of b");
        b = scanner.nextInt();

        c=a;
        a=b;
        b=c;

        System.out.println("after swap a:"+a);
        System.out.println("after swap b:"+b);


    }

}
