package assignment;

public class Employee61 {
    int id ;
    String name;
    String address;
    int TS,salary1 = 20000, salary2 = 21000;

    Employee61(int id,String name, String address){
        this.id = id;
        this.name = name;
        this.address = address;

        System.out.println("Id=" +id+ " Name=" +name+ " Address=" +address);
    }

    Employee61(){

    }
    public void calculatingSalary() {
        TS = salary1 + salary2;
        System.out.println("Calculate salary:"+TS);
    }

    public static void main(String[] args) {
        Employee61 obj = new Employee61(1,"Kiran","Sangli");
        Employee61 obj1 = new Employee61();
        obj1.calculatingSalary();

    }

}
