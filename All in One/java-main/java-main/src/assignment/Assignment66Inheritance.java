package assignment;

public class Assignment66Inheritance {
    int id;
    String name;

    public static void main(String[] args) {
        Assignment66Inheritance obj = new Assignment66Inheritance();
        obj.id = 1;
        obj.name = "Pankaj";
        System.out.println("id="+obj.id+ " name="+obj.name);
    }
}
class SingleLevel extends Assignment66Inheritance{

    public static void main(String[] args) {
        SingleLevel obj1 = new SingleLevel();
        obj1.id= 2;
        obj1.name = "Parkash";
        System.out.println("id="+obj1.id+ " name="+obj1.name);
    }
}
class Multilevel extends SingleLevel{

    public static void main(String[] args) {
        Multilevel obj2 = new Multilevel();
        obj2.id = 3;
        obj2.name = "Suraj";
        System.out.println("id="+obj2.id+ " name="+obj2.name);
    }
}
