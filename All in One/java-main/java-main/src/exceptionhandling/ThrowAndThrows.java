package exceptionhandling;

public class ThrowAndThrows {

    public static void main(String[] args) throws Exception {

        int age = 17;

        if (age<=18){
            throw new Exception("You can't vote");
        }else{
            System.out.println("You can vote");
        }
        System.out.println("Hello");
    }
}

/**
 *
 *                throw                                        Throws
 * 1. Used to throw exception                           1. Used to declare exception
 * 2.throw is used in method                            2.Is used with method signature
 * 3.You can throw only one exception at a time         3.you can declare multiple exception
 * 4.throw is followed by instance                      4.Throws is followed by class
 *
 */
