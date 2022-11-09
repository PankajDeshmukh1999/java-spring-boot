package staticKeyword;

public class StaticKeyword {

    int empId;
    String empName;
    static String companyName = "TCS";              //use static bez All emp works in tcs

    public static void display(){
        System.out.println(" In display function ");
    }

    public StaticKeyword(int empId, String empName){
        this.empId = empId;
        this.empName = empName;
        System.out.println("Id="+empId+ " Name="+empName+ " CompanyName="+companyName);
    }

    public static void main(String[] args) {
        StaticKeyword obj1 = new StaticKeyword(1,"Rahul");
        StaticKeyword obj2 = new StaticKeyword(2,"Rohit");
        display();                        //not write obj bcz in function we write tha static key its adv. of static key
    }

}