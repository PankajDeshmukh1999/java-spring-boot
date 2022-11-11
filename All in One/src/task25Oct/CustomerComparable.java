package task25Oct;

import java.util.Comparator;

public class CustomerComparable implements Comparator<Customer>{


	@Override
	public int compare(Customer o1, Customer o2) {
		if(o1.getId()<o2.getId()) {
			return -1;
		}if(o1.getId()>o2.getId()) {
			return 1;
		}
		return 0;
	}

}
