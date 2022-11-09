package assignment;

import java.util.Scanner;

public class Assignment33 {

    public static void main(String[] args) {            //Table of multiplication

        int i,n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number :");
        n = scanner.nextInt();

        for ( i=1; i<=10 ; ++i){
            System.out.println(n*i);
        }

    }
}
