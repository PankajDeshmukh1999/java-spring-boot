package superKeyWord;

public class SuperKeyWordDemo {
   int i = 10;

   public void display(){
       System.out.println("In parent class method");
   }
   SuperKeyWordDemo(){
       System.out.println("in parent class ");
   }

}
class A extends SuperKeyWordDemo{
    int i = 12;

    public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj.i);
        obj.display();
        obj.show();
    }
    public void show (){
        System.out.println(super.i);
    }
    A (){
        System.out.println("child class");
    }

}