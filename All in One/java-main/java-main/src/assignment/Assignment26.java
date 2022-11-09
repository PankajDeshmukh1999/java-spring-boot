package assignment;

import java.util.Scanner;

public class Assignment26 {

    public static void main(String[] args) {

        char ch;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your choice");
        ch = scanner.next().charAt(0);

        if (ch >= 'a' && ch <= 'z'){
            System.out.println("Alphabet");
        }else if (ch>=1 && ch<= 9){
            System.out.println("Digit");
        }else {
            System.out.println("Special character");
        }

    }
}
