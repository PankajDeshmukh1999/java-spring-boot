package inheritance;

public class Teacher { //parent class  super class

    int id;
    String name;            //instance variable
    String address;
    static String collegeName = "Institute of technology,pune";
}
class MathsTeacher extends Teacher{
    public static void main(String[] args) {

    MathsTeacher obj = new MathsTeacher();
    obj.id= 1;
    obj.name = "uday";
    obj.address = "sangli";

        System.out.println("id="+obj.id+ " name="+obj.name+ " address="+obj.address+ " CollegeName=" +collegeName);

    }
}
class PhysicsTeacher extends Teacher{

    PhysicsTeacher(int id){
        this.id = id;

        System.out.println("Id="+id);
    }

    public static void main(String[]args){


        PhysicsTeacher obj = new PhysicsTeacher(1);
        obj.id = 2;
        obj.name = "pankaj";
        obj.address = "pune";
         System.out.println("id="+obj.id+ " name="+obj.name+ " address="+obj.address);


    }
}

/** Inheritance => Inheriting properties of parent class into the child class .
 * Adv.             code reuse
 * Types =          Single level inheritance > parent class to 1child class.
 *                  Multilevel        ''     > parent class to child class in row.
 *                  hei.       ''    > parent class to two or more child class.
 * */
