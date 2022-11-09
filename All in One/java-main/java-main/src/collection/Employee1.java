package collection;

import java.util.*;

public class Employee1 {
    int id ;
    String name;
    double salary;

    public Employee1(int id,String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;

        System.out.println("Id="+id+ " Name="+name+ " Salary="+salary);
    }

    public static void main(String[] args) {
        Employee1 obj = new Employee1(1,"Pankaj",12000);
        Employee1 obj1 = new Employee1(2,"Prakash",15000);
        Employee1 obj2 = new Employee1(3,"kiran",18000);
        Employee1 obj3 = new Employee1(4,"Suraj",20000);

        List<Employee1> list = new ArrayList<>();
        list.add(obj);
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);

        list.forEach(s->{
            System.out.println(s.id+" "+s.name+" "+s.salary);
        });
    }
}
