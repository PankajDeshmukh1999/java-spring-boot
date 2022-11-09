package retraining;

import java.util.Scanner;

public class Customer {
	public int id;
	public String name;
	public long phone;
	public String email;
	
	Scanner sc = new Scanner(System.in);
	
	public void createAccount() {
		System.out.println("Enter id");
		id=sc.nextInt();
		System.out.println("Enter name");
		name=sc.next();
		System.out.println("Enter phone");
		phone=sc.nextLong();
		System.out.println("Enter email");
		email=sc.next();

	}
	
	public void showAccount() {
		System.out.println("id:"+ id);
		System.out.println("name:"+ name);
		System.out.println("phone:"+phone);
		System.out.println("email:"+ email);
	}
	
	
	
	public static void main(String[] args) {
		Customer obj = new  Customer();
		obj.createAccount();
		obj.showAccount();
	}

}
