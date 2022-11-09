package assignment;

import java.util.Scanner;

public class Assignment22 {

    public static void main(String[] args) {

        int ch;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter alphabet:");
        ch = scanner.next().charAt(0);

        if (ch>='A' && ch<='Z'){
            System.out.println("Uppercase alphabet:");
        }else if (ch>='a' && ch<='z'){
            System.out.println("Lowercase alphabet:");
        }else{
            System.out.println("Entered value is not alphabet");
        }

    }
}
