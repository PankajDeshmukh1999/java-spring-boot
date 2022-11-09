package retraining.collection;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class CustomerBO extends Customer {

	Scanner sc = new Scanner(System.in);

	public static List<Customer> populateCustomers(List<String> csvList)  {
		
			Customer customer = new Customer();
			customer.setId(Integer.parseInt(csvList.get(0)));
			customer.setName(csvList.get(1));
			customer.setGender(csvList.get(2));
			customer.setEmail(csvList.get(3));
			customer.setContactNumber(csvList.get(4));
			customer.setCreatedOn(new  Date());
			
		List<Customer> list = new ArrayList<>();
		list.add(customer);
		return list;
		
	}

	public static List<Customer> findCustomerNameFromList(List<Customer> customers, String subString) {

		List<Customer> list = new ArrayList<>();
		
		for (Customer customer : list) {
			if(customer.getName().toLowerCase().contains(subString));{
				list.add(customer);
			}
		}
		return list;
	}
}
