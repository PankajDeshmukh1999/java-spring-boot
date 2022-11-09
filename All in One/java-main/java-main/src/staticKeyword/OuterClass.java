package staticKeyword;

public class OuterClass {

    int i = 80;

    static class InnerClass{                // class under class  use of static keyword
        int i = 10;

        public static void main(String[] args) {
            InnerClass obj = new InnerClass();
            System.out.println(obj.i);
        }
    }

    public static void main(String[] args) {
        OuterClass obj1 = new OuterClass();
        System.out.println(obj1.i);

        OuterClass.InnerClass obj2 = new OuterClass.InnerClass();
        System.out.println(obj2.i);

        StaticKeyword.display();
    }
}
