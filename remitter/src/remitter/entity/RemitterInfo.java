package remitter.entity;

public class RemitterInfo {
	private int accountNumber;
	private String name;
	private String emailId;
	private String password;
	private double balance;
	private String accountStatus;//
	private String ifscCode;
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
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getAccountStatus() {
		return accountStatus;
	}
	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	public RemitterInfo(int accountNumber, String name, String emailId, String password, double balance,
			String accountStatus, String ifscCode) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.emailId = emailId;
		this.password = password;
		this.balance = balance;
		this.accountStatus = accountStatus;
		this.ifscCode = ifscCode;
	}
	public RemitterInfo() {
		super();
	}
	@Override
	public String toString() {
		return "RemitterInfo [accountNumber=" + accountNumber + ", name=" + name + ", emailId=" + emailId
				+ ", password=" + password + ", balance=" + balance + ", accountStatus=" + accountStatus + ", ifscCode="
				+ ifscCode + "]";
	}
	
	
}
