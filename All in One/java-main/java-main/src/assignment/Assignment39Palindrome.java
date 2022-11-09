package assignment;

public class Assignment39Palindrome {                         //palindrome or not  ex.454
    public static void main(String[] args) {
        int n, sum = 0,temp;
        int num = 125;

        temp = num;

        while(num>0){
            n = num%10;
            sum = (sum*10)+n;
            num  = num/10;

        }
        if (temp == sum){
            System.out.println("Palindrome Number");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
