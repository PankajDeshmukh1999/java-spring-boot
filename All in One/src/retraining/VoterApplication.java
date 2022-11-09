package retraining;

import java.util.Scanner;

public class VoterApplication {

	public void ageLimit() throws InvalidAgeException {
		System.out.println("Welcome voters ");
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your age:");
		int age =sc.nextInt();
		if(age>=18) {
			System.out.println("You can vote "+age);
		}else {
			throw new InvalidAgeException("You cannot vote your age is:"+age+".age must be  18 or above");
		}
	}
	public static void main(String[] args) {
		VoterApplication obj = new VoterApplication();
		obj.ageLimit();
	}
}
