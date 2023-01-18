package remitter.entity;

public class BeneficiaryInfo {

	private int accountNumber;
	private String name;
	private String bankName;
	private String ifscCode;
	private double currentBalance;
	private String email;
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	public double getCurrentBalance() {
		return currentBalance;
	}
	public void setCurrentBalance(double currentBalance) {
		this.currentBalance = currentBalance;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public BeneficiaryInfo(int accountNumber, String name, String bankName, String ifscCode, double currentBalance,
			String email) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.bankName = bankName;
		this.ifscCode = ifscCode;
		this.currentBalance = currentBalance;
		this.email = email;
	}
	public BeneficiaryInfo() {
		super();
	}
	@Override
	public String toString() {
		return "BeneficiaryInfo [accountNumber=" + accountNumber + ", name=" + name + ", bankName=" + bankName
				+ ", ifscCode=" + ifscCode + ", currentBalance=" + currentBalance + ", email=" + email + "]";
	}
	
	
}
