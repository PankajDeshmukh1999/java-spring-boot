package assignment;

import java.util.Scanner;

public class Assignment8 {

    public static void main(String[] args) {    //area and perimeter of circle

        float area,peri,r;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius");
        r= scanner.nextFloat();

        area = (float) (3.14*r*r);
        peri = (float) (2*3.14*r*r);

        System.out.println("Area of circle:"+area);
        System.out.println("Perimeter of circle:"+peri);


    }
}
