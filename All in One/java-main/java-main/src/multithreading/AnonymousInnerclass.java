package multithreading;

public class AnonymousInnerclass {
    public static void main(String[] args) {
        MyInterface obj = new MyInterface() {
            @Override
            public Integer add(int a, int b) {
                return a+b;
            }

            @Override
            public Integer sub(int a, int b) {
                return a-b;
            }
        };
        System.out.println("Addition -> "+obj.add(2,5));
        System.out.println("Subtraction -> "+obj.sub(6,4));


    }
}
interface MyInterface{
    Integer add(int a, int b);
    Integer sub(int a, int b);
}
