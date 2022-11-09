package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeSort implements Comparable<EmployeeSort> {
    int id;
    String name;
    String address;

    public EmployeeSort(int id, String name, String address){
        this.id = id;
        this.name = name;
        this.address = address;

    }

    public static void main(String[] args) {
        EmployeeSort employeeSort = new EmployeeSort(1,"Pankaj","Sangli");
        EmployeeSort employeeSort1 = new EmployeeSort(2,"Rahul","Sangli");
        EmployeeSort employeeSort2 = new EmployeeSort(3,"Kiran","Sangli");

        List<EmployeeSort> list = new ArrayList<>();
        list.add(employeeSort);
        list.add(employeeSort1);
        list.add(employeeSort2);

        Collections.sort(list);
        list.forEach(s->{
            System.out.println(s);
        });

    }

    @Override
    public String toString() {
        return "EmployeeSort{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

//    @Override
//    public int compareTo(EmployeeSort employeeSort) {
//        if (this.id == employeeSort.id){
//            return 0;
//        }else if (this.id> employeeSort.id){
//            return 1;
//        }else{
//            return -1;
//        }
//    }


    @Override
    public int compareTo(EmployeeSort employeeSort) {
        return this.name.compareTo(employeeSort.name);
    }
}
