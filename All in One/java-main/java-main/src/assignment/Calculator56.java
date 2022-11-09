package assignment;

import java.util.Scanner;

public class Calculator56 {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Simple Calculator");

            System.out.println("\nHere are your options:");
            System.out.println("\n1. Addition");
            System.out.println("\n2. Subtraction");
            System.out.println("\n3. Division");
            System.out.println("\n4. Multiplication");

            System.out.print("\n What would you like to do?: ");
            int choice = scanner.nextInt();
            System.out.println();


            if (choice == 1){
                addition();
            }
            else if (choice == 2){
                subtraction();
            }
            else if (choice == 3){
                division();
            }
            else if (choice == 4){
                multiplication();
            }

            System.out.println();
            scanner.close();
        }

        public static void  addition(){

            int nOne, nTwo;
            Scanner scanner = new Scanner(System.in);

            System.out.println("Addition");

            System.out.print("\nFirst Number: ");
            nOne = scanner.nextInt();

            System.out.print("\nSecond Number: ");
            nTwo = scanner.nextInt();

            scanner.close();

            System.out.println("\nSum: " + nOne + " + " + nTwo + " = " + (nOne + nTwo));
        }

        public static void subtraction(){
            int nOne, nTwo;
            Scanner scanner = new Scanner(System.in);

            System.out.println("Subtraction");

            System.out.print("\nFirst Number: ");
            nOne = scanner.nextInt();

            System.out.print("\nSecond Number: ");
            nTwo = scanner.nextInt();

            scanner.close();
            System.out.println("\nSum: " + nOne + " - " + nTwo + " = " + (nOne - nTwo));
        }

        public static void division(){
            int nOne, nTwo;
            Scanner scanner = new Scanner(System.in);

            System.out.println("Division");

            System.out.print("\nFirst Number: ");
            nOne = scanner.nextInt();

            System.out.print("\nSecond Number: ");
            nTwo = scanner.nextInt();

            scanner.close();
            System.out.println("\nSum: " + nOne + " / " + nTwo + " = " + (nOne / nTwo));
        }

        public static void multiplication(){
            int nOne, nTwo;
            Scanner scanner = new Scanner(System.in);

            System.out.println("Multiplication");

            System.out.print("\nFirst Number: ");
            nOne = scanner.nextInt();

            System.out.print("\nSecond Number: ");
            nTwo = scanner.nextInt();

            scanner.close();
            System.out.println("\nSum: " + nOne + " x " + nTwo + " = " + (nOne * nTwo));
        }
    }

