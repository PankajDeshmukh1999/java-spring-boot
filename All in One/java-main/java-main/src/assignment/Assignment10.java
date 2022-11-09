package assignment;

import java.util.Scanner;

public class Assignment10 {

    //Area of equilateral
    public static void main(String[] args) {

        double A;
        float a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of side");
        a= scanner.nextFloat();

        A= (1.73*a*a)/4;                    //√3=1.73

        System.out.println("Area of equilateral" +A);

    }
}
