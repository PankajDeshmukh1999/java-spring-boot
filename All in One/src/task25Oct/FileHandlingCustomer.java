package task25Oct;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileHandlingCustomer {

	public static void main(String[] args) throws IOException, ParseException, CustomerNotFound {
		Scanner sc = new Scanner(System.in);
		FileReader fileReader = new FileReader("C:\\Users\\M1082861\\Desktop\\demo.txt");
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		List<String> customer = new ArrayList<>();
		String str;
		while ((str = bufferedReader.readLine()) != null) {
			customer.add(str);
		}

		CustomerBO bo = new CustomerBO();
		List<Customer> list = bo.populateCustomers(customer);
		System.out.println("Id\tName\t\tGender\t\tEmail\tContactNumber\t\tCreateOn");
		for (Customer c : list) {
			System.out.println(c.getId() + "\t" + c.getName() + "\t\t" + c.getGender() + "\t" + c.getEmail() + "\t"
					+ c.getContactNumber() + "\t" + c.getCreatedOn());
		}
		
		
		System.out.println("Search customer list:");
		String s = sc.nextLine();
		List<Customer> list2 = bo.findCustomerNameFromList(list, s);
		System.out.println("Id\tName\t\tGender\t\tEmail\tContactNumber\t\tCreateOn");
		for (Customer c : list2) {
			System.out.println(c.getId() + "\t" + c.getName() + "\t\t" + c.getGender() + "\t" + c.getEmail() + "\t"
					+ c.getContactNumber() + "\t" + c.getCreatedOn());

		}
		bufferedReader.close();
	}
}
