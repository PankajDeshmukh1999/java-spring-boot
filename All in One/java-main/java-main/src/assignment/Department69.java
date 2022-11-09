package assignment;

 class Department {

    String departmentName;
    String hodName;

    public Department(){

    }

     public Department(String departmentName, String hodName){
         this.departmentName=departmentName;
         this.hodName=hodName;

         System.out.println("DepartmentName=>"+departmentName+ " HODName=>"+hodName);

     }

    public static void main(String[] args) {
        Department department= new Department(" Computer Department"," rahul");
    }
}
class StaffMember extends Department{
    String memberName;
    String qualification;

    public StaffMember(String memberName, String qualification){
        this.memberName=memberName;
        this.qualification=qualification;

        System.out.println("MemberName=>"+memberName+ " Qualification=>"+qualification);
    }

    public static void main(String[] args) {
        Department department = new Department("Computer Department","rahul");
        StaffMember staffMember = new StaffMember("Deepak","M.Tech");
    }

}
