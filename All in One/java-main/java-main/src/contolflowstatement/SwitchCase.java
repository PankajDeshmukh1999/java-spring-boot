package contolflowstatement;
import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
       int i;
       Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value");
        i = scanner.nextInt();

        switch (i){

            case 1 :
                    int j;
                    System.out.println("Enter number");
                    j= scanner.nextInt();

                      switch (j){

                      case 20 :
                          System.out.println(20);
                          break;
                      case 30 :
                          System.out.println(30);
                          break;
                  }
                System.out.println("One");
                break;
            case 2 :
                System.out.println("Two");
                break;
            case 3 :
                System.out.println("Three");
                break;
            default :
                System.out.println("default");
        }
    }

}
