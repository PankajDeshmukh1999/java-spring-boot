package comparator;

import java.util.Comparator;

public class EmployeeComapartor implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
//		 return o1.getName().compareTo(o2.getName());
//		  return o2.getName().compareTo(o1.getName());

		if(o1.getId()<o2.getId()) {
			return -1;
		}if(o1.getId()>o2.getId()) {
			return 1;
		}
		return 0;
	}

}
