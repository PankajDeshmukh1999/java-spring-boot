package encapsulation;

public class Demo1 {
   private int id;
   private  String name;

   public void setId(int id){
       this.id = id;
   }
   public int getId(){
       return id;
   }

    public String getName() {
        return name;
    }
    public void setName(String name){
       this.name = name;
    }

    public static void main(String[] args) {
        Demo1 obj = new Demo1();
        obj.id= 1;
        obj.name = "pankaj";

        System.out.println("id="+obj.id+ " name="+obj.name);
    }
}
/**
 * def.   wrapping date, code together in single unit
 *      >  always define variables using private keyword
 *      > setter and getter for set nd get values of variable
 */