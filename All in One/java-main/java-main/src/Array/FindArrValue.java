package Array;
import  java.util.Scanner;
import java.util.stream.IntStream;

public class FindArrValue {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5};
        int toFind;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number :");
        toFind = scanner.nextInt();
//        boolean found = false;
//
//        for (int n : a){
//            if (n == toFind){
//                found = true;
//                break;
//            }
//        }
//        if (found){
//            System.out.println(toFind+ " is found");
//        }else
//            System.out.println(toFind+ " is not find");
        boolean found = IntStream.of(a).anyMatch(n->n == toFind);
        if (found)
            System.out.println(toFind+" is found");
        else
            System.out.println(toFind+ " is not found");
    }
}
