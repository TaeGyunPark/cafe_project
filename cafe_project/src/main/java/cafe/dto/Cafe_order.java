package cafe.dto;

public class Cafe_order {
	private int order_no;
	private int pay_no;
	private int customer_no;
	private int cafe_no;
	private int menu_no;
	private int order_quantity;
	private int order_sum;
	
	
	@Override
	public String toString() {
		return "Cafe_order [order_no=" + order_no + ", pay_no=" + pay_no + ", customer_no=" + customer_no + ", cafe_no="
				+ cafe_no + ", menu_no=" + menu_no + ", order_quantity=" + order_quantity + ", order_sum=" + order_sum
				+ "]";
	}


	public int getOrder_no() {
		return order_no;
	}


	public void setOrder_no(int order_no) {
		this.order_no = order_no;
	}


	public int getPay_no() {
		return pay_no;
	}


	public void setPay_no(int pay_no) {
		this.pay_no = pay_no;
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


	public int getMenu_no() {
		return menu_no;
	}


	public void setMenu_no(int menu_no) {
		this.menu_no = menu_no;
	}


	public int getOrder_quantity() {
		return order_quantity;
	}


	public void setOrder_quantity(int order_quantity) {
		this.order_quantity = order_quantity;
	}


	public int getOrder_sum() {
		return order_sum;
	}


	public void setOrder_sum(int order_sum) {
		this.order_sum = order_sum;
	}
	
	
	
	
	
}
