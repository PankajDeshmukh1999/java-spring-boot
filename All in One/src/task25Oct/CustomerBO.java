package task25Oct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class CustomerBO {

	Scanner sc = new Scanner(System.in);

	public static List<Customer> populateCustomers(List<String> csvList) throws ParseException {

		List<Customer> customer1 = new ArrayList<>();
		for (String customer2 : csvList) {
			Customer cus = new Customer();
			StringTokenizer str1 = new StringTokenizer(customer2, ",");

			cus.setId(Integer.parseInt(str1.nextToken()));
			cus.setName(str1.nextToken());
			cus.setGender(str1.nextToken());
			cus.setEmail(str1.nextToken());
			cus.setContactNumber(str1.nextToken());

			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			Date convert = sdf.parse(str1.nextToken());
			cus.setCreatedOn(convert);

			customer1.add(cus);

		}
		return customer1;

	}

	public static List<Customer> findCustomerNameFromList(List<Customer> customers, String subString)
			throws CustomerNotFound {

		List<Customer> filter = new ArrayList<>();

		for (Customer customer : customers) {
			if (customer.getName().toLowerCase().contains(subString)) {
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
