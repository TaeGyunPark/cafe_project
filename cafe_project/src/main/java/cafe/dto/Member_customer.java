package cafe.dto;

public class Member_customer {
	private int customer_no;
	private String customer_email;
	private String customer_pw;
	private String customer_name;
	private String customer_nick;
	private int customer_phone;
	private String customer_status;
	
	@Override
	public String toString() {
		return "Member_customer [customer_no=" + customer_no + ", customer_email=" + customer_email + ", customer_pw="
				+ customer_pw + ", customer_name=" + customer_name + ", customer_nick=" + customer_nick
				+ ", customer_phone=" + customer_phone + ", customer_status=" + customer_status + "]";
	}

	public int getCustomer_no() {
		return customer_no;
	}

	public void setCustomer_no(int customer_no) {
		this.customer_no = customer_no;
	}

	public String getCustomer_email() {
		return customer_email;
	}

	public void setCustomer_email(String customer_email) {
		this.customer_email = customer_email;
	}

	public String getCustomer_pw() {
		return customer_pw;
	}

	public void setCustomer_pw(String customer_pw) {
		this.customer_pw = customer_pw;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public String getCustomer_nick() {
		return customer_nick;
	}

	public void setCustomer_nick(String customer_nick) {
		this.customer_nick = customer_nick;
	}

	public int getCustomer_phone() {
		return customer_phone;
	}

	public void setCustomer_phone(int customer_phone) {
		this.customer_phone = customer_phone;
	}

	public String getCustomer_status() {
		return customer_status;
	}

	public void setCustomer_status(String customer_status) {
		this.customer_status = customer_status;
	}
	
	
	
	
	
	
}
