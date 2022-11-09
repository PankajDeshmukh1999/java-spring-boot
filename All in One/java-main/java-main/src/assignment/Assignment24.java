package assignment;

import java.util.Scanner;

public class Assignment24 {

    public static void main(String[] args) {            //profit amd loss

        double sp,cp,profit,loss;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your cost price:");
        cp = scanner.nextDouble();
        System.out.println("Enter your selling price:");
        sp = scanner.nextDouble();

        profit = sp-cp;
        loss = cp-sp;
         if (sp>cp){
             System.out.println("Your profit is:"+profit);
         }else if (sp<cp){
             System.out.println("Your loss is:"+loss);
         }

    }
}
