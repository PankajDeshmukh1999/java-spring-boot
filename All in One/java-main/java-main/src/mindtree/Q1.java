package mindtree;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        int n , digit, sum=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 3 number digit");
        n = scanner.nextInt();

        while (n > 0){
            digit = n % 10;
            sum = sum + digit;
            n = n/10;
        }
        System.out.println("Sum of 3 digit :" +sum);
    }
}
