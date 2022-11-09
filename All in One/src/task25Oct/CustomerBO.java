package task25Oct;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class CustomerBO extends Customer {

	Scanner sc = new Scanner(System.in);

	/**
	 * @param csvList
	 * @return
	 */
	public static List<Customer> populateCustomers(List<String> csvList) {

		List<Customer> customer1 = new ArrayList<>();
		for (String customer2 : csvList) {
			StringTokenizer str1 = new StringTokenizer(customer2, ",");
			Customer cus = new Customer();
			cus.setId(Integer.parseInt(str1.nextToken()));
			cus.setName(str1.nextToken());
			cus.setGender(str1.nextToken());
			cus.setEmail(str1.nextToken());
			
//			String[] str = customer2.split(",");
//			cus.setCreatedOn(str1.nextToken(new Date()));
//			cus.setId(Integer.parseInt(str[0]));
//			cus.setName(str[1]);
//			cus.setGender(str[2]);
//			cus.setEmail(str[3]);
//			cus.setContactNumber(str[4]);
//			cus.setCreatedOn(new Date());
			
			customer1.add(cus);
		}
		return customer1;
	}

	public static List<Customer> findCustomerNameFromList(List<Customer> customers, String subString)
			throws CustomerNotFound {

		List<Customer> filter = new ArrayList<>();

//		List<Customer> cl = customers.stream().filter(e -> e.getName().equalsIgnoreCase(subString))
//				.collect(Collectors.toList());

		for (Customer customer : customers) {
			if (customer.getName().toLowerCase().contains(subString))
				;
			{
				filter.add(customer);
			}
		}
		if (filter.size() == 0) {
			throw new CustomerNotFound("no customer exist:");
		} else {
			return filter;
		}

	}
}
