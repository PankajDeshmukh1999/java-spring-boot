package retraining.collection;

import java.util.Date;

public class Customer {

	private int id;
	private String name;
	private String gender;
	private String email;
	private String contactNumber;
	private Date createdOn;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String string) {
		this.gender = string;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date date) {
		this.createdOn = date;
	}

	public Customer(int id, String name, String gender, String email, String contactNumber, Date createdOn) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.email = email;
		this.contactNumber = contactNumber;
		this.createdOn = createdOn;
	}

	public Customer() {
		super();
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", gender=" + gender + ", email=" + email + ", contactNumber="
				+ contactNumber + ", createdOn=" + createdOn;
	}


}
