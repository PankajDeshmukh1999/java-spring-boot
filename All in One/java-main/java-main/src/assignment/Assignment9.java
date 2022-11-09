package assignment;

import java.util.Scanner;

public class Assignment9 {
    public static void main(String[] args) {

        float l,b, area, perimeter;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length");
        l = scanner.nextFloat();
        System.out.println("Enter breadth");
        b = scanner.nextFloat();

        area =l*b;
        perimeter =(2*l)+(2*b);

        System.out.println("area of rectangle"+area);
        System.out.println("perimeter of rectangle"+perimeter);


    }
}
