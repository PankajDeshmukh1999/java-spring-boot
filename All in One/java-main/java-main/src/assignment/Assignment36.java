package assignment;

import java.util.Scanner;

public class Assignment36 {

    public static void main(String[] args) {
//        int count =0, num=2457;
//
//        while(num !=0){
//            num /= 10;
//            ++count;
//        }
//        System.out.println("count number :"+count);

        int count = 0,num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter digits:");
        num = scanner.nextInt();

        while(num != 0){
            num /= 10;
            ++count;
        }
        System.out.println("Count digits:"+count);
    }
}
