package contolflowstatement;

import java.util.Scanner;

public class IfElseDemo {
    public static void main(String[] args) {

        int age;
        String nationality;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age:");
        age = scanner.nextInt();
        System.out.println("Enter Nationality");
        nationality = scanner.next();

        if (age>=18) {
            if (nationality.equals("Indian")) {                       //Nested
                System.out.println("you can vote");
            } else {
                System.out.println("Not Indian");
            }
        }else if(age<=18){
            System.out.println("You can not vote");
        }






//        int a = 10, b = 20,c = 30;
//
//        if (a>b && a>c){                    //ladder if
//            System.out.println("a is greater");
//        } else if (b > c){
//            System.out.println("b is greater");
//        } else {
//            System.out.println("c is greater");
//        }


    }
}
