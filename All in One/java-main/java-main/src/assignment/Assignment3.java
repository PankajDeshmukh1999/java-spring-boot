package assignment;

import java.util.Scanner;

public class Assignment3 {

    public static void main(String[] args) {

//        int p=1000,r=9,t=12,simpleInterest;
//        simpleInterest=p*r*t/100;
//        System.out.println(simpleInterest);

        int p,r,t,SimpleInterest;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter price");
        p = scanner.nextInt();
        System.out.println("Enter rate");
        r = scanner.nextInt();
        System.out.println("Enter timePeriod");
        t = scanner.nextInt();

        SimpleInterest = p*r*t/100;

        System.out.println(SimpleInterest);

    }

}
