package contolflowstatement;

import java.util.Scanner;

public class IfDemo {

    public static void main(String[]args) {

//        int age;
//        int weight;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your age" + "Enter your weight");
//        age = scanner.nextInt();
//        weight = scanner.nextInt();
//
//        if (age >= 18) {
//            if (weight <= 50) {
//                System.out.println("You  can donate your blood");
//            } else {
//                System.out.println("you are not able to donate blood");
//            }
//        } else {
//            System.out.println("Age must be greater then 18");
//        }


        //grade system
//            int marks;
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Enter your Marks");
//            marks=scanner.nextInt();
//
//
//        if (marks < 50) {
//            System.out.println("fail");
//        }else if (marks>=50 && marks<60){
//            System.out.println("Grade D");
//        }else if(marks>=60 && marks<70){
//            System.out.println("Grade C");
//        }else if(marks>=70 && marks<80){
//            System.out.println("Grade B");
//        }else if(marks>=80 && marks<90){
//            System.out.println("Grade A");
//        }else if(marks>=90 && marks<100){
//            System.out.println("Grade A+");
//        }else{
//            System.out.println("invalid");
//        }



//        int a = 12, b= 10 , c = 3, d = 1;
//
//
//        if (a<b & a<c & a<d){
//            System.out.println("a is smallest ");
//        }else if (b<c & b<d){
//            System.out.println("b is smallest");
//        }else if (c < d){
//            System.out.println("c is smallest");
//        }else{
//            System.out.println("d is smallest");
//        }

        int a,b,c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value a");
        a = scanner.nextInt();
        System.out.println("Enter value b");
        b = scanner.nextInt();
        System.out.println("Enter value c");
        c = scanner.nextInt();

        if (a>b && a>c){
            System.out.println("A id greatest");
        }else if (b>c){
            System.out.println("B is greatest");
        }else{
            System.out.println("c is greatest");
        }



    }
}
