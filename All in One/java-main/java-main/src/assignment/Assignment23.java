package assignment;

import java.util.Scanner;

public class Assignment23 {

    public static void main(String[] args) {

        int x,y,z;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value of X:");
        x = scanner.nextInt();
        System.out.println("Enter value of Y:");
        y = scanner.nextInt();
        System.out.println("Enter value of Z:");
        z = scanner.nextInt();

        if (x==y && y==z){
            System.out.println("Equilateral triangle ");
        }else if (x==y || y==z || z==x){
            System.out.println("Isosceles triangle");
        }else{
            System.out.println("Scalene triangle");
        }

    }
}
