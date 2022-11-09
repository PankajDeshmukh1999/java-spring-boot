package polymorphism;

public class Overloading {

    public int add(int a,int b){
        return a+b;
    }
    public double add(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Overloading obj = new Overloading();
        System.out.println(obj.add(45,14));
        System.out.println(obj.add(14,45,78));
    }
}

