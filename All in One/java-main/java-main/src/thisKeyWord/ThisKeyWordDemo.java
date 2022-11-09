package thisKeyWord;

public class ThisKeyWordDemo {
     int id;                                            //instance variable
     String name;

      public void setValue(int id, String name){         //Local variable
          this.id = id;
          this.name = name;
      }
      public void show(){
          System.out.println("In show method");
      }
      public void display(){
          this.show();
      }

    public static void main(String[] args) {
        ThisKeyWordDemo obj = new ThisKeyWordDemo();
        obj.id = 1;
        obj.name = "pankaj";

        System.out.println("id="+obj.id+ " name="+obj.name);
        obj.display();
    }
}
/**
 * use compare variable as instance and local
 */

