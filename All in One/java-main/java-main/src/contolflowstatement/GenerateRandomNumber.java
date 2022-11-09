package contolflowstatement;
import java.util.Scanner;

public class GenerateRandomNumber {
    public static void main(String[] args) {            //generate random number

        int guessNumber = (int) (Math.random() * 100) + 20, num, counter = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter the value");
            num = scanner.nextInt();

            if (num < guessNumber) {
                System.out.println("Number is less");
            } else if (num > guessNumber) {
                System.out.println("Number is greater");
            } else {
                System.out.println("You guess correct" + counter + "attempt");
            }
        } while (num != guessNumber);
    }


    }

