package collection;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Student1 {
    int id;
    String name;
    String address;

    Student1(int id, String name, String address){
        this.id = id;
        this.name = name;
        this.address = address;

    }

    @Override
    public boolean equals(Object o) {

        Student1 student1 = (Student1) o;
        return id == student1.id && Objects.equals(name, student1.name) && Objects.equals(address, student1.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, address);
    }

    public static void main(String[] args) {
        Student1 student1 = new Student1(1,"Pankaj","sangli");  //hashcode
        Student1 student2 = new Student1(1,"Pankaj","sangli");
        Student1 student3 = new Student1(2,"Pankaj","sangli");

        Set<Student1> set = new HashSet<>();
        set.add(student1);
        set.add(student2);
        set.add(student3);

        set.forEach(s->{
            System.out.println(s.id+" "+s.name+" "+s.address);
        });

    }
}
