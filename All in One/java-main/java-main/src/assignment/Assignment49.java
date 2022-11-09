package assignment;

public class Assignment49 {

    public static void main(String[] args) {

        int i;
        for (i = 1; i<=5; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (i = 1; i<=5; i++){
            for (int j=i; j<=5; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
