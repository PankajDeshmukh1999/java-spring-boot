package contolflowstatement;

public class StarDemo {
    public static void main(String[] args) {


        //Diamond pattern
        for (int i = 1; i <= 4; i++) {
            for (int j = i; j <= 4; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" *");

            }
            System.out.println();
        }
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <= 4; k++) {
                System.out.print(" *");

            }
            System.out.println();


        }

        //diamond pattern in only edge
//        for (int i =1; i<=5; i++){
//            for(int j=1; j<=5; j++){
//                if (i==1&&j==3||i==2&&j==2||i==2&&j==4||i==3&&j==1||i==3&&j==5||i==4&&j==2||i==4&&j==4||i==5&&j==3){
//                    System.out.print("*");
//                }
//                System.out.print(" ");
//            }
//            System.out.println();
//        }


    }
}
