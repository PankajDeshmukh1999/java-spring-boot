package comparator;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeMain {
	public static void main(String[] args) {
		ArrayList<Employee> al= new ArrayList<>();
		
		al.add(new Employee(111,"Pankaj"));
		al.add(new Employee(11,"Shubham"));
		al.add(new Employee(1111,"vrushabh"));
		al.add(new Employee(231,"Alok"));
		
		Collections.sort(al,new EmployeeComapartor());
		
		for (Employee employee : al) {
			System.out.println(employee.getId()+" "+employee.getName());
		}

	}

}
