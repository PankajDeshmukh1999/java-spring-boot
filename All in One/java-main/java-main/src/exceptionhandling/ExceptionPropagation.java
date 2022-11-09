package exceptionhandling;

public class ExceptionPropagation {

    public void a(){
        int i = 10;
        int j = i/0;

        System.out.println(j);
    }
    public void b(){
       try{
           a();
       }catch (ArithmeticException e){
           System.out.println("Exception handled");
       }
    }
    public void c(){
        b();
    }

    public static void main(String[] args) {
        ExceptionPropagation obj = new ExceptionPropagation();
        obj.c();
    }
}
//only checked exception is propagated unchecked exception is not propagated.