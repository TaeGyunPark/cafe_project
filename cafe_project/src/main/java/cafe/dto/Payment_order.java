package cafe.dto;

import java.util.Date;

public class Payment_order {
	private int pay_id;
	private int customer_no;
	private int cafe_no;
	private String pay_method;
	private String pay_data;
	private String pay_pg;
	private int pay_amount;
	private Date pay_date;
	private String pay_status;
	
	
	@Override
	public String toString() {
		return "Payment_order [pay_id=" + pay_id + ", customer_no=" + customer_no + ", cafe_no=" + cafe_no
				+ ", pay_method=" + pay_method + ", pay_data=" + pay_data + ", pay_pg=" + pay_pg + ", pay_amount="
				+ pay_amount + ", pay_date=" + pay_date + ", pay_status=" + pay_status + "]";
	}


	public int getPay_id() {
		return pay_id;
	}


	public void setPay_id(int pay_id) {
		this.pay_id = pay_id;
	}


	public int getCustomer_no() {
		return customer_no;
	}


	public void setCustomer_no(int customer_no) {
		this.customer_no = customer_no;
	}


	public int getCafe_no() {
		return cafe_no;
	}


	public void setCafe_no(int cafe_no) {
		this.cafe_no = cafe_no;
	}


	public String getPay_method() {
		return pay_method;
	}


	public void setPay_method(String pay_method) {
		this.pay_method = pay_method;
	}


	public String getPay_data() {
		return pay_data;
	}


	public void setPay_data(String pay_data) {
		this.pay_data = pay_data;
	}


	public String getPay_pg() {
		return pay_pg;
	}


	public void setPay_pg(String pay_pg) {
		this.pay_pg = pay_pg;
	}


	public int getPay_amount() {
		return pay_amount;
	}


	public void setPay_amount(int pay_amount) {
		this.pay_amount = pay_amount;
	}


	public Date getPay_date() {
		return pay_date;
	}


	public void setPay_date(Date pay_date) {
		this.pay_date = pay_date;
	}


	public String getPay_status() {
		return pay_status;
	}


	public void setPay_status(String pay_status) {
		this.pay_status = pay_status;
	}
	
	
	
	
}
