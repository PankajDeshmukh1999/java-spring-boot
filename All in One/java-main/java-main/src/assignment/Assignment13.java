package assignment;

import java.util.Scanner;

public class Assignment13 {
    public static void main(String[] args) {

       int i;
       String name;
       char ch;
       float f;
       long l;
       short s;
       byte b;
       boolean B;

       Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of i");
        i= scanner.nextInt();
        System.out.println("Enter String");
        name= scanner.next();
        System.out.println("char");
        ch = scanner.next().charAt(0);
        System.out.println("float");
        f= scanner.nextFloat();
        System.out.println("long");
        l= scanner.nextLong();
        System.out.println("short");
        s= scanner.nextShort();
        System.out.println("byte");
        b= scanner.nextByte();
        System.out.println("Boolean");
        B= scanner.hasNext();

        System.out.println("int "+i);
        System.out.println("String " +name);
        System.out.println("char "+ch);
        System.out.println("float "+f);
        System.out.println("long "+l);
        System.out.println("short "+s);
        System.out.println("byte "+b);
        System.out.println("true/false "+B);

    }
}
