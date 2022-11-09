package assignment;

import java.util.Scanner;

public class Assignment12 {

    //Average and total marks of 6 subject input through the user
    public static void main(String[] args) {

//        float s1,s2,s3,s4,s5,s6,total,avg;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("subject s1");
//        s1= scanner.nextFloat();
//        System.out.println("subject s2");
//        s2= scanner.nextFloat();
//        System.out.println("subject s3");
//        s3= scanner.nextFloat();
//        System.out.println("subject s4");
//        s4= scanner.nextFloat();
//        System.out.println("subject s5");
//        s5= scanner.nextFloat();
//        System.out.println("subject s6");
//        s6= scanner.nextFloat();
//
//        total= s1+s2+s3+s4+s5+s6;
//        avg = total/6;
//
//        System.out.println("Total marks all subject:"+total);
//        System.out.println("Average of total marks:" +avg);

        float s1=60,s2=70,s3=65,s4=90;
        float total,average;

        total=s1+s2+s3+s4;

        average=total/4;

        System.out.println("Total marks of subject is: "+total);
        System.out.println("Average of marks is: "+average);


    }

}
