package abstraction;

public abstract class Vehicle {
    abstract void run();
    abstract void seater();
    void color(){               //concrete
        System.out.println("Black color");
    }

}
class Honda extends Vehicle{
    public static void main(String[] args) {
        Honda honda = new Honda();
        System.out.println("HONDA CITY IS");
        honda.color();
        honda.run();
        honda.seater();

    }

    @Override
    void run() {
        System.out.println("running safely");
    }

    @Override
    void seater() {
        System.out.println("Honda is 4 seater vehicle");
    }
}
