package assignment;

public class Vehicle58 {

    String color;
    static int wheel = 4;
    int gearCount;

    public  Vehicle58(String color,int gearCount){
        this.color = color;
        this.gearCount = gearCount;

        System.out.println("Color="+color+ " GearCount="+gearCount);
    }
    public Vehicle58(){
        color = "Black";
        gearCount = 4;
        System.out.println("Color="+color+ " Wheel="+wheel+ " GearCount="+gearCount);
    }

    public static void main(String[] args) {
        Vehicle58 obj = new Vehicle58();
        Vehicle58 obj1 = new Vehicle58("Black",4);
    }

}
