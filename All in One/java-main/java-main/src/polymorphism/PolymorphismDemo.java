package polymorphism;

public class PolymorphismDemo {

    public int add (int a,int b){
        return a+b;
    }
    public int add (int a,int b,int c){
        return a+b+c;

    }

     public void Calculator(int a,int b){
       int sub = a-b;
       int add = a+b;

        System.out.println("add="+add);
        System.out.println("sub="+sub);
        System.out.println("mul="+a*b);
        System.out.println("div="+a/b);
    }

    public static void main(String[] args) {
        PolymorphismDemo obj = new PolymorphismDemo();
        System.out.println(obj.add(1 ,2));
        System.out.println(obj.add(1,3,5 ));
         obj.Calculator(8,6);
    }
}
