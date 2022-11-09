package retraining.collection;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CustomerMain {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Numer of customer:-");
		int custNo=sc.nextInt();
		
		List<Customer> customerList = new ArrayList<>();
		List<String> customers = new ArrayList<>();
		
		for (int i = 0; i <= custNo; i++) {
			System.out.println("Enter the customer"+i+"details:");
			if(i==1) {
				sc.nextLine();
				String input = sc.nextLine();
				
				StringTokenizer stringTokenizer = new StringTokenizer(input,",");
				int count= stringTokenizer.countTokens();
				
				for (int j = 0; j < count; j++) {
					String s= stringTokenizer.nextToken();
					customers.add(s);
				}
				System.out.println();
			}
		}
		
		customerList= CustomerBO.populateCustomers(customers);
		
		for (Customer customer2 : customerList) {
			System.out.println(customer2.getId());
			System.out.println(customer2.getName());
			System.out.println(customer2.getGender());
			System.out.println(customer2.getEmail());
			System.out.println(customer2.getContactNumber());
			System.out.println(customer2.getCreatedOn());

		}
		System.out.println("Enter substring to search");
		String search = sc.next();
		for (Customer customer2 : customerList) {
			System.out.println(customer2.getId());
			System.out.println(customer2.getName());
			System.out.println(customer2.getGender());
			System.out.println(customer2.getEmail());
			System.out.println(customer2.getContactNumber());
			System.out.println(customer2.getCreatedOn());

		}
	}
	
}
