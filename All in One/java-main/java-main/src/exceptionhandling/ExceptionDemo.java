package exceptionhandling;

public class ExceptionDemo {
    public static void main(String[] args) {

        int i=10;
        int j=0;
        try{
        int c=i/j;
        //try{
            String str = null;
            System.out.println(str.toLowerCase());
//
//        }catch(NullPointerException e){
//            System.out.println(e);
//        }

        }catch(NullPointerException e){
            e.printStackTrace();
        }catch(ArithmeticException e){

            try{
                int d= i /j;
                System.out.println(d);
            }catch (ArithmeticException arithmeticException){
                arithmeticException.printStackTrace();
            }
        }finally {
            System.out.println("In finally");
        }
        System.out.println("hii");

    }
}
/**
 * Single try is not possible
 */