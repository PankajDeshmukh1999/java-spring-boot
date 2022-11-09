package assignment;

public class Worker68 {
    String sName;
    int sAge;
    long sNumber;
    String address;
    double salary;

    public void displaySalary(){
        System.out.println("Salary="+salary);
    }
    public Worker68(){        //default constructor

    }

    public Worker68(String sName, int sAge, long sNumber, String address, double salary){
        this.sName=sName;
        this.sAge=sAge;
        this.sNumber = sNumber;
        this.address = address;
        this.salary = salary;

        System.out.println("Name="+sName+ " Age="+sAge+ " Number="+sNumber+ " Address="+address+ " Salary="+salary);

    }

    public static void main(String[] args) {
        Worker68 worker = new Worker68("Kiran",25,7769968812L,"Sangli",55000);
        Employee employee = new Employee("Management");
        Manager manager = new Manager("Production");

    }
   static class Employee extends Worker68 {
        String WorkSpecialization;

        public Employee(String workSpecialization){
            this.WorkSpecialization = workSpecialization;

            System.out.println("WorkSpecialization="+workSpecialization);
        }

        public static void main(String[] args) {
            Employee employee = new Employee("Management");

        }
    }
    static class Manager extends Worker68 {
        String Department;

        public Manager(String Department){
            this.Department = Department;

            System.out.println("Department="+Department);
        }

        public static void main(String[] args) {
            Manager manager = new Manager("Production");


        }
    }
}
