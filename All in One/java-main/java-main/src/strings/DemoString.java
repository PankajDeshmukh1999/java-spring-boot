package strings;

import java.util.Arrays;

public class DemoString {

    static  void remove(char str[],int length){
        int index=0;

        for(int i=0; i<length; i++){
            int j;
            for(j=0; j<i; j++){
                if (str[i] == str[j]){
                    break;
                }
            }
            if (j==i){
                str[index++]=str[i];
            }
        }
        System.out.println(String.valueOf(Arrays.copyOf(str,index)));
    }

    public static void main(String[] args) {
        String str1= "cherreis";
        char str[] = str1.toCharArray();
        int len = str.length;
        remove(str,len);
    }
}
