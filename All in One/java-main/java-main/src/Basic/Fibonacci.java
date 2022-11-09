package Basic;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        //sum of last two number

//        int i, num1=0,num2=1,num3,count=14;;
//        System.out.println(num1+ " " +num2);
//
//        for ( i=1; i<=count;++i){
//
//            num3 = num1+num2;
//            System.out.println(num3);
//
//            num1 = num2;
//            num2 = num3;
//        }

        int i,n1,n2,n3,count;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n1 value");
        n1 = scanner.nextInt();
        System.out.println("Enter n2 value");
        n2 = scanner.nextInt();
        System.out.println("Enter count value");
        count = scanner.nextInt();


        for (i=2;i<=count;++i){
            n3 = n1+n2;
            System.out.println(n3);

            n1=n2;
            n2=n3;

        }


    }

}
