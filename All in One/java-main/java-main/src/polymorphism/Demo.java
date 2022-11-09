package polymorphism;

public class Demo {

    public int add(int a, int b){
        return a+b;
    }
    public double add (double a, int b){
        return a*b;
    }

    public static void main(String[] args) {
        Demo obj = new Demo();

        System.out.println(obj.add(34,65));
        System.out.println(obj.add(34.5,3));
    }
}

/**
 * Overloading => should be same name,same class but different arguments/parameters
 *              def.  the ability to take onr from many(many form)
 *
 *
 */