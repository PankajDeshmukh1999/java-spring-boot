package polymorphism;

public class Animal { //parent class
   public void sound(){
       System.out.println("*Animal sound*");
   }

}
class Cat extends Animal{
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.sound();

    }

    @Override
    public void sound() {
        System.out.println("cat sound");
    }
}
class Dog extends Animal{
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
    }

    @Override
    public void sound() {
        System.out.println("Dog sound");
    }
}




/**
 *  overriding => having same name,same arguments but different class
 *
 */