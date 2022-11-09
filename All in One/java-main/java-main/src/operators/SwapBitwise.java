package operators;

import java.util.Scanner;

public class SwapBitwise {
    public static void main(String[] args) {

        int a= 10,b=20;

        a = a^b;
        b = a^b;
        a = a^b;

        System.out.println("after swapping a:" +a+ " after swapping b:" +b);

//        int a, b;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the 1st number");
//        a = scanner.nextInt();
//        System.out.println("Enter the 2nd number");
//        b = scanner.nextInt();
//        System.out.println("a"+a+ "b"+b);
//
//        a = a^b;
//        b = a^b;
//        a = a^b;
//        System.out.println("After swap");
//
//        System.out.println("a"+a+ "b"+b);

    }

}
