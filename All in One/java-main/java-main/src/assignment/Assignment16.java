package assignment;

import java.util.Scanner;

public class Assignment16 {    //electricity bill

    public static void main(String[] args) {

        int unit;
        double bill,FinalBill;
        double ASC;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your current unit");
        unit= scanner.nextInt();
        double first50= 50*0.5;
        double next100 = 100*0.75;
        double after100 = 100*1.20;
        double above250 = 250*1.5;

        if (unit<=50){
            bill=unit*0.25;
            ASC=20*bill/100;

            System.out.println("Your bill is: "+ASC);

        }else if (unit>50 && unit<=150){
            bill=first50+((unit-50)*0.75);
            ASC=20*bill/100;

            System.out.println("Your bill is: "+ASC);

        }else if (unit>150 && unit<=250){
            bill=next100+((unit-50)*1.2);
            ASC=20*bill/100;

            System.out.println("Your bill is: "+ASC);

        }else{
            bill = first50+next100+after100+((unit-250)*1.5);
            ASC = bill + (bill*0.2);
            System.out.println("Your bill is :"+ASC);
        }
    }

}
