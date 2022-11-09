package polymorphism;

public class OverridingDemo {

    public void display(){
        System.out.println("In parent class display method");
    }
}
class Demo1 extends OverridingDemo{
    public static void main(String[] args) {
      Demo1 obj = new Demo1();
      obj.display();
    }

    @Override
    public void display() {
        System.out.println("In child class display method");
    }
}
