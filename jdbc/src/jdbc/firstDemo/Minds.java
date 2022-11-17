package jdbc.firstDemo;

public class Minds {
	private int mind_id;
	private String mind_name;
	private String mind_designation;
	private int phone;
	private String email;

	public int getMind_id() {
		return mind_id;
	}

	public void setMind_id(int mind_id) {
		this.mind_id = mind_id;
	}

	public String getMind_name() {
		return mind_name;
	}

	public void setMind_name(String mind_name) {
		this.mind_name = mind_name;
	}

	public String getMind_designation() {
		return mind_designation;
	}

	public void setMind_designation(String mind_designation) {
		this.mind_designation = mind_designation;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Minds(int mind_id, String mind_name, String mind_designation, int phone, String email) {
		super();
		this.mind_id = mind_id;
		this.mind_name = mind_name;
		this.mind_designation = mind_designation;
		this.phone = phone;
		this.email = email;
	}

	public Minds() {
		super();
	}

}
