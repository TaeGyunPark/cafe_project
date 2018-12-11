package cafe.dto;

import java.util.Date;

public class Cafe_ordering_department {
	
	private int ordering_department_no;
	private int cafe_no;
	private String ordering_department_name;
	private String ordering_department_address;
	private String ordering_department_manager;
	private int ordering_department_phone;
	private Date ordering_department_date;
	private String ordering_department_remarks;
	
	
	@Override
	public String toString() {
		return "Cafe_ordering_department [ordering_department_no=" + ordering_department_no + ", cafe_no=" + cafe_no
				+ ", ordering_department_name=" + ordering_department_name + ", ordering_department_address="
				+ ordering_department_address + ", ordering_department_manager=" + ordering_department_manager
				+ ", ordering_department_phone=" + ordering_department_phone + ", ordering_department_registration="
				+ ordering_department_registration + ", ordering_department_remarks=" + ordering_department_remarks
				+ "]";
	}


	public int getOrdering_department_no() {
		return ordering_department_no;
	}


	public void setOrdering_department_no(int ordering_department_no) {
		this.ordering_department_no = ordering_department_no;
	}


	public int getCafe_no() {
		return cafe_no;
	}


	public void setCafe_no(int cafe_no) {
		this.cafe_no = cafe_no;
	}


	public String getOrdering_department_name() {
		return ordering_department_name;
	}


	public void setOrdering_department_name(String ordering_department_name) {
		this.ordering_department_name = ordering_department_name;
	}


	public String getOrdering_department_address() {
		return ordering_department_address;
	}


	public void setOrdering_department_address(String ordering_department_address) {
		this.ordering_department_address = ordering_department_address;
	}


	public String getOrdering_department_manager() {
		return ordering_department_manager;
	}


	public void setOrdering_department_manager(String ordering_department_manager) {
		this.ordering_department_manager = ordering_department_manager;
	}


	public int getOrdering_department_phone() {
		return ordering_department_phone;
	}


	public void setOrdering_department_phone(int ordering_department_phone) {
		this.ordering_department_phone = ordering_department_phone;
	}


	public Date getOrdering_department_registration() {
		return ordering_department_registration;
	}


	public void setOrdering_department_registration(Date ordering_department_registration) {
		this.ordering_department_registration = ordering_department_registration;
	}


	public String getOrdering_department_remarks() {
		return ordering_department_remarks;
	}


	public void setOrdering_department_remarks(String ordering_department_remarks) {
		this.ordering_department_remarks = ordering_department_remarks;
	}
	
	
	
	
	
	
}
