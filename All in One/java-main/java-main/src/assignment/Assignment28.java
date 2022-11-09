package assignment;

import java.util.Scanner;

public class Assignment28 {

    public static void main(String[] args) {

        int s1,s2,s3,s4,s5,sum;
        double pr;
        Scanner scanner = new Scanner(System.in);
        System.out.println("marks od subject one:");
        s1 = scanner.nextInt();
        System.out.println("marks od subject two:");
        s2 = scanner.nextInt();
        System.out.println("marks od subject three:");
        s3 = scanner.nextInt();
        System.out.println("marks od subject four:");
        s4 = scanner.nextInt();
        System.out.println("marks od subject five:");
        s5 = scanner.nextInt();

        sum = s1+s2+s3+s4+s5;

        pr = sum/5;

        if (s5<35 || s1<35 || s2<35 || s3<35 || s4<35 ){
            System.out.println("Sorry Your fail");
        }

        System.out.println("Total marks:"+sum);
        System.out.println("Total percentage:"+pr);

        if (pr>=90){
            System.out.println("Grade A");
        }else if (pr>=80){
            System.out.println("Grade B");
        }else if (pr>=70){
            System.out.println("Grade C");
        }else if (pr>=60){
            System.out.println("Grade D");
        }else if (pr>=40){
            System.out.println("Grade E");
        }else if (pr<40){
            System.out.println("Grade F");
        }else{
            System.out.println("Invalid");
        }


    }
}
