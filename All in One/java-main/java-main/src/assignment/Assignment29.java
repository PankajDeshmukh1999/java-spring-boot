package assignment;

import java.util.Scanner;

public class Assignment29 {
    public static void main(String[] args) {
        int i, n1, n2, n3, count;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n1 value");
        n1 = scanner.nextInt();
        System.out.println("Enter n2 value");
        n2 = scanner.nextInt();
        System.out.println("Enter count value");
        count = scanner.nextInt();


        for (i = 2; i <= count; ++i) {
            n3 = n1 + n2;
            System.out.println(n3);

            n1 = n2;
            n2 = n3;
        }
    }
}
