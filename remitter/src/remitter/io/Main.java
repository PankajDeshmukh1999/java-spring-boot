package remitter.io;

import java.util.Scanner;

import remitter.bo.RemitterBoImplimentation;
import remitter.entity.BeneficiaryInfo;
import remitter.entity.RemitterInfo;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int ch = 0;
		do {
			System.out.println("1.for Remitter registration \n2.Login \n3.exit");
			ch = s.nextInt();
			s.nextLine();
			switch (ch) {
			case 1: {
				addNewRemitter();
				break;
			}
			case 2: {
				if (loginRemitter()) {
					do {
						System.out.println("1.Beneficiary Registration \n 2.Fund Tranfer \n 3.Exit");
						ch = s.nextInt();
						s.nextLine();
						switch (ch) {
						case 1: {
							addNewBeneficiary();
							break;
						}
						case 2: {
							fundTransaction();
							break;
						}
						case 3: {
							System.out.println("Exit......");
							break;
						}
						default:
							throw new IllegalArgumentException("Unexpected value: " + ch);
						}
					} while (ch > 0 && ch < 3);
				} else {
					System.out.println("Invalid Credentials!!!!!!! ");
				}
				break;

			}
			case 3: {
				System.out.println("Exit");
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + ch);
			}
		} while (ch > 0 && ch < 3);

	}

	private static int fundTransaction() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Remitter account number :");
		int rac = s.nextInt();
		s.nextLine();

		System.out.println("Enter beneficiary account number :");
		int bac = s.nextInt();
		s.nextLine();

		System.out.println("Enter transaction amount :");
		double amount = s.nextDouble();

		RemitterBoImplimentation rdi = new RemitterBoImplimentation();
		return rdi.fundTransfer(rac, bac, amount);
	}

	private static boolean loginRemitter() {
		RemitterBoImplimentation rdi = new RemitterBoImplimentation();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter account number for login :");
		int ac = s.nextInt();
		s.nextLine();
		System.out.println("Enter password for login :");
		String ps = s.nextLine();
		return rdi.Login(ac, ps);
	}

	private static void addNewBeneficiary() {
		Scanner s = new Scanner(System.in);
		BeneficiaryInfo info = new BeneficiaryInfo();
		System.out.println("Enter account number :");
		info.setAccountNumber(s.nextInt());
		s.nextLine();

		System.out.println("Enter beneficiary name :");
		info.setName(s.nextLine());

		System.out.println("Enter bank name :");
		info.setBankName(s.nextLine());

		System.out.println("Enter IFSC_Code :");
		info.setIfscCode(s.nextLine());

		System.out.println("Enter current balance :");
		info.setCurrentBalance(s.nextDouble());
		s.nextLine();

		System.out.println("Enter Email id :");
		info.setEmail(s.nextLine());

		RemitterBoImplimentation rbi = new RemitterBoImplimentation();
		int state = rbi.addbeneficiary(info);
		if (info.getCurrentBalance() != 0) {
			System.out.println(" please enter beneficiary current balance zero");
		} else {
			if (state != 0) {
				System.out.println("beneficiary details add successfully");
			} else {
				System.out.println("beneficiary details not registerrd");
			}
		}
	}

	private static void addNewRemitter() {
		Scanner s = new Scanner(System.in);
		RemitterInfo info = new RemitterInfo();
		System.out.println("enter account number :");
		info.setAccountNumber(s.nextInt());
		s.nextLine();

		System.out.println("Enter name:");
		info.setName(s.nextLine());

		System.out.println("Enter Email id :");
		info.setEmailId(s.nextLine());

		System.out.println("Enter Password :");
		info.setPassword(s.nextLine());

		System.out.println("Enter account balance :");
		info.setBalance(s.nextDouble());
		s.nextLine();

		System.out.println("Enter account status:");
		info.setAccountStatus(s.nextLine());

		System.out.println("Enter IFSC_Code:");
		info.setIfscCode(s.nextLine());

		RemitterBoImplimentation rbi = new RemitterBoImplimentation();
		int state = rbi.addRemitter(info);
		if (state != 0) {
			System.out.println("Remitter details add successfully");
		} else {
			System.out.println("Remitter details not registerrd");
		}

	}
}
