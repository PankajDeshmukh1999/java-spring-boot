package assignment;

import java.util.Scanner;

public class Assignment5 {

    public static void main(String[] args) {  // covert days into year,month,day.

        int year,week,day,days;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter days");
        days= scanner.nextInt();

        year= days/365;
        week = year%7;
        day = (days%365)%7;

        System.out.println("year" +year);
        System.out.println("week"  +week);
        System.out.println("day" +day);

    }

}
