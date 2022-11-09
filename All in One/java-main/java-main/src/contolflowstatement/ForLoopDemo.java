package contolflowstatement;

import java.util.List;

public class ForLoopDemo {

    public static void main(String[] args) {

        int[] arr ={10,20,30,40};             //primitive array,Array index starts from 0.


        for (int i= arr.length-1; i>=0;i--){
            System.out.println(arr[i]);
        }

//        for (int i=0; i<arr.length;i++){                    //traditional for loop
//            System.out.println(arr[i]);
//        }

        for (int i:arr){                                   //for each/enhanced loop
            System.out.println(i);
        }

    }
}
