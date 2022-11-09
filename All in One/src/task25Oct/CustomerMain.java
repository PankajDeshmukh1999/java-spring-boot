package task25Oct;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerMain {

	public static void main(String[] args) throws CustomerNotFound {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number of customer:-");
		int nocus = sc.nextInt();

		String sCustomerdet = null;

		List<String> customers = new ArrayList<>();

		sc.nextLine();

		for (int i = 1; i <= nocus; i++) {
			System.out.println("Enter the customer " + (i) + " details:");
			sCustomerdet = sc.nextLine();
			customers.add(sCustomerdet);
		}
		System.out.println("*****customer details List*****");
		List<Customer> listofCustomer = CustomerBO.populateCustomers(customers);
		System.out.println("Id-" + " Name" + " Gender" + " Email" + " ContactNo" + "Date");

		for (Customer customer2 : listofCustomer) {
			System.out.println("*****************");
			System.out.println(customer2.getId());
			System.out.println(customer2.getName());
			System.out.println(customer2.getGender());
			System.out.println(customer2.getEmail());
			System.out.println(customer2.getContactNumber());
			System.out.println(customer2.getCreatedOn());

			System.out.println("*******************");

		}

		System.out.println("Enter the search word");
		String sub = sc.nextLine().toLowerCase();
		List<Customer> filter = CustomerBO.findCustomerNameFromList(listofCustomer, sub);
		Customer c = new Customer();
		if (filter.size() == 0) {
			throw new CustomerNotFound("No customer avilable in the list");
		} else {
			System.out.println("Search customer list");
			System.out.println("Id-" + " Name" + " Gender" + " Email" + " ContactNo" + "Date");
			for (Customer customer2 : filter) {
				System.out.println(customer2.getId());
				System.out.println(customer2.getName());
				System.out.println(customer2.getGender());
				System.out.println(customer2.getEmail());
				System.out.println(customer2.getContactNumber());
				System.out.println(customer2.getCreatedOn());
			}
			sc.close();
		}
	}

}
