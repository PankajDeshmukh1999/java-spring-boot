package inheritance;

public class Company {
    int empId;
    String empName;
    String companyName;

}
class Asus extends Company{
    public static void main(String[] args) {
        Asus asus = new Asus();
        asus.empId = 1;
        asus.empName = "Pankaj";
        asus.companyName = "ASUS";
        System.out.println("id="+asus.empId+ " name="+asus.empName+ " companyName="+asus.companyName);
    }
}
class Lenovo extends Company{
    public static void main(String[] args) {
        Lenovo lenovo = new Lenovo();
        lenovo.empId = 1;
        lenovo.empName = "Suraj";
        lenovo.companyName = "Lenovo";
        System.out.println("id="+lenovo.empId+ " name="+lenovo.empName+ " companyName="+lenovo.companyName);

    }
}

