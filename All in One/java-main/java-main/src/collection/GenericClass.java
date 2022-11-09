package collection;

public class GenericClass <T>{
    private T t;

    public void setT(T t){
        this.t = t;
    }
    public T getT(){
        return t;
    }

    public static void main(String[] args) {
        GenericClass<Integer> obj1 = new GenericClass<>();
        GenericClass<String> obj2 = new GenericClass<>();
        obj1.setT(1);
        obj2.setT("Kiran");
        System.out.println(obj1.getT()+" "+obj2.getT());
    }
}
/**
 * T = any type
 * E = element
 * k = key
 * v = value
 */
