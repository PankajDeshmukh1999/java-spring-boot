package abstraction;

 public class Cricket implements Sport1 {
    public static void main(String[] args) {
        Cricket obj = new Cricket();
        obj.play();
//        obj.play1();
    }

     @Override
     public void play() {
         System.out.println(" play cricket");
     }

     @Override
     public void play1() {
         System.out.println("play1 cricket");
     }
 }
/**
 *
 * ex > array list,linked list is perfect example od abstraction(who work how)
 */