package assignment;

public class Student52 {

    int rollNumber;
    String name;
    long contactNumber;
    double totalMarks;

   public void data(){
       System.out.println("RollNumber="+rollNumber);
       System.out.println(" Name="+name);
   }

    public Student52(int rollNumber, String name, long contactNumber, double totalMarks){

        this.rollNumber = rollNumber;
        this.name = name;
        this.contactNumber = contactNumber;
        this.totalMarks = totalMarks;

        System.out.println("RollNumber="+rollNumber+ " Name="+name+ " ContactNumber="+contactNumber+ " TotalMarks="+totalMarks);

    }

    public static void main(String[] args) {
        Student52 obj = new Student52(1,"Pankaj",9145585467l,422);
        obj.data();

    }
}
