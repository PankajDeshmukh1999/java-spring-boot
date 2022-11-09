package contolflowstatement;

public class StarPattern {
    public static void main(String[] args) {

//        //BOX pattern
//        for (int i=1;i<=5;i++){
//            for (int j=1;j<=5;j++){
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }


//        for (int i=1;i<=5;i++){
//            for (int j=1;j<=i;j++){
//               System.out.print(" * ");
//            }
//            System.out.println();
//        }

//        for (int i= 1;i<=5;i++){
//            for (int j=i;j<=5;j++){
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }

        for (int i=1;i<=4;i++){
            for (int j=1;j<=4;j++){
              if(j==2&&i==2||j==2&&i==3||j==3&&i==2||j==3&&i==3){
                  System.out.print(" ");
              }else{
                System.out.print("*");
              }
            }
            System.out.println();
        }


    }
}