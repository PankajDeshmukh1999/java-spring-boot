package encapsulation;

public class EncapsulationDemo {
    private int id;
    private String name;
    private String address;

   public void setId(int id){
       this.id =id;

   }

    public int getId() {
        return id;
    }
    public void setName(String name){
       this.name=name;
    }
    public String getName(){
       return name;
    }
    public void setAddress(String address){
       this.address=address;
    }

    public String getAddress() {
        return address;
    }

    public static void main(String[] args) {
        EncapsulationDemo obj = new EncapsulationDemo();
        obj.id=1;
        obj.name="Rahul";
        obj.address="Pune";


        System.out.println("id =" +obj.id+ " name =" +obj.name+ " address =" + obj.address);

        obj.id = 2;
        obj.name = "uday";
        obj.address = "sangli";

        System.out.println("id =" +obj.id+ " name =" +obj.name+ " address =" + obj.address);
    }
}
