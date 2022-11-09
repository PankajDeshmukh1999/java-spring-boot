package Basic;

public class Palindrome {
    public static void main(String[] args) {
        int num = 121;
        int temp = num;
        int rev = 0,rem;

        while (temp !=0){
            rem= temp %10;
            rev = rev * 10 + rem;
            temp = temp/10;
        }
        if (num == rev){
            System.out.println(num+ " Palindrome");
        }else{
            System.out.println(num+ " Not palindrome");
        }

    }
}
