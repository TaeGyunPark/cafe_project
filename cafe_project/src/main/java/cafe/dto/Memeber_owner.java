package cafe.dto;

import java.util.Date;

public class Memeber_owner {
	private int owner_no;
	private int cafe_no;
	private String owner_email;
	private String owner_pw;
	private String owner_phone;
	private String owner_name;
	private String business_name;
	private int business_registration_number;
	private Date owner_join_date;
	
	
	@Override
	public String toString() {
		return "Memeber_owner [owner_no=" + owner_no + ", cafe_no=" + cafe_no + ", owner_email=" + owner_email
				+ ", owner_pw=" + owner_pw + ", owner_phone=" + owner_phone + ", owner_name=" + owner_name
				+ ", business_name=" + business_name + ", business_registration_number=" + business_registration_number
				+ ", owner_join_date=" + owner_join_date + "]";
	}


	public int getOwner_no() {
		return owner_no;
	}


	public void setOwner_no(int owner_no) {
		this.owner_no = owner_no;
	}


	public int getCafe_no() {
		return cafe_no;
	}


	public void setCafe_no(int cafe_no) {
		this.cafe_no = cafe_no;
	}


	public String getOwner_email() {
		return owner_email;
	}


	public void setOwner_email(String owner_email) {
		this.owner_email = owner_email;
	}


	public String getOwner_pw() {
		return owner_pw;
	}


	public void setOwner_pw(String owner_pw) {
		this.owner_pw = owner_pw;
	}


	public String getOwner_phone() {
		return owner_phone;
	}


	public void setOwner_phone(String owner_phone) {
		this.owner_phone = owner_phone;
	}


	public String getOwner_name() {
		return owner_name;
	}


	public void setOwner_name(String owner_name) {
		this.owner_name = owner_name;
	}


	public String getBusiness_name() {
		return business_name;
	}


	public void setBusiness_name(String business_name) {
		this.business_name = business_name;
	}


	public int getBusiness_registration_number() {
		return business_registration_number;
	}


	public void setBusiness_registration_number(int business_registration_number) {
		this.business_registration_number = business_registration_number;
	}


	public Date getOwner_join_date() {
		return owner_join_date;
	}


	public void setOwner_join_date(Date owner_join_date) {
		this.owner_join_date = owner_join_date;
	}
	
	
	
	
	
}
