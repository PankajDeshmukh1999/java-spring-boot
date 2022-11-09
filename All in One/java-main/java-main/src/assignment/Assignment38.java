package assignment;

import java.util.Scanner;

public class Assignment38 {
    public static void main(String[] args) {            //even or odd number between enter range

        int i, j, n1, n2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first Number between range:");
        n1 = scanner.nextInt();
        System.out.println("Enter second Number of range:");
        n2 = scanner.nextInt();

        System.out.println("Display the even number between " + n1 + "And " + n2 + " are");

        for (i = n1; i <= n2; i++) {
            j = i % 2;
            if (j == 0)
                System.out.println(i);
        }

        System.out.println("Display the odd number between " + n1 + "And " + n2 + " are");
        for (i = n1; i <= n2; i++) {
            j = i % 2;
            if (j == 1)
                System.out.println(i);
        }
    }
}
