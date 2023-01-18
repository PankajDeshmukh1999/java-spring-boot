package remitter.entity;
import java.util.Date;

public class FundTransfer {

	private int transactionId;
	private int beneficiaryAccountNumber;
	private double transactionAmount; 
	private int remitterAccountNumber;
	private String transactionStatus;
	private Date transactionDate = new Date();
	
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public int getBeneficiaryAccountNumber() {
		return beneficiaryAccountNumber;
	}
	public void setBeneficiaryAccountNumber(int beneficiaryAccountNumber) {
		this.beneficiaryAccountNumber = beneficiaryAccountNumber;
	}
	public double getTransactionAmount() {
		return transactionAmount;
	}
	public void setTransactionAmount(double transactionAmount) {
		this.transactionAmount = transactionAmount;
	}
	public int getRemitterAccountNumber() {
		return remitterAccountNumber;
	}
	public void setRemitterAccountNumber(int remitterAccountNumber) {
		this.remitterAccountNumber = remitterAccountNumber;
	}
	public String getTransactionStatus() {
		return transactionStatus;
	}
	public void setTransactionStatus(String transactionStatus) {
		this.transactionStatus = transactionStatus;
	}
	public Date getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	
	public FundTransfer() {
		super();
	}

	public FundTransfer(int transactionId, int beneficiaryAccountNumber, double transactionAmount,
			int remitterAccountNumber, String transactionStatus, Date transactionDate) {
		super();
		this.transactionId = transactionId;
		this.beneficiaryAccountNumber = beneficiaryAccountNumber;
		this.transactionAmount = transactionAmount;
		this.remitterAccountNumber = remitterAccountNumber;
		this.transactionStatus = transactionStatus;
		this.transactionDate = transactionDate;
	}
	@Override
	public String toString() {
		return "FoundTransfer [transactionId=" + transactionId + ", beneficiaryAccountNumber="
				+ beneficiaryAccountNumber + ", transactionAmount=" + transactionAmount + ", remitterAccountNumber="
				+ remitterAccountNumber + ", transactionStatus=" + transactionStatus + ", transactionDate="
				+ transactionDate + "]";
	}
	
}
