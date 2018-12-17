package cafe.dto;

public class Cafe_stock {
	private int stock_no;
	private int cafe_no;
	private String stock_name;
	private int stock_current_amount;
	private int stock_minimum_quantity;
	private String stock_ordering_unit;
	private String stock_unit;
	private int stock_unit_quantity;
	private int stock_unit_price;
	private int ordering_department_no;
	
	@Override
	public String toString() {
		return "Cafe_stock [stock_no=" + stock_no + ", cafe_no=" + cafe_no + ", stock_name=" + stock_name
				+ ", stock_current_amount=" + stock_current_amount + ", stock_minimum_quantity="
				+ stock_minimum_quantity + ", stock_ordering_unit=" + stock_ordering_unit + ", stock_unit=" + stock_unit
				+ ", stock_unit_quantity=" + stock_unit_quantity + ", stock_unit_price=" + stock_unit_price
				+ ", ordering_department_name=" + ordering_department_no + "]";
	}

	public int getStock_no() {
		return stock_no;
	}

	public void setStock_no(int stock_no) {
		this.stock_no = stock_no;
	}

	public int getCafe_no() {
		return cafe_no;
	}

	public void setCafe_no(int cafe_no) {
		this.cafe_no = cafe_no;
	}

	public String getStock_name() {
		return stock_name;
	}

	public void setStock_name(String stock_name) {
		this.stock_name = stock_name;
	}

	public int getStock_current_amount() {
		return stock_current_amount;
	}

	public void setStock_current_amount(int stock_current_amount) {
		this.stock_current_amount = stock_current_amount;
	}

	public int getStock_minimum_quantity() {
		return stock_minimum_quantity;
	}

	public void setStock_minimum_quantity(int stock_minimum_quantity) {
		this.stock_minimum_quantity = stock_minimum_quantity;
	}

	public String getStock_ordering_unit() {
		return stock_ordering_unit;
	}

	public void setStock_ordering_unit(String stock_ordering_unit) {
		this.stock_ordering_unit = stock_ordering_unit;
	}

	public String getStock_unit() {
		return stock_unit;
	}

	public void setStock_unit(String stock_unit) {
		this.stock_unit = stock_unit;
	}

	public int getStock_unit_quantity() {
		return stock_unit_quantity;
	}

	public void setStock_unit_quantity(int stock_unit_quantity) {
		this.stock_unit_quantity = stock_unit_quantity;
	}

	public int getStock_unit_price() {
		return stock_unit_price;
	}

	public void setStock_unit_price(int stock_unit_price) {
		this.stock_unit_price = stock_unit_price;
	}

	public int getOrdering_department_no() {
		return ordering_department_no;
	}

	public void setOrdering_department_name(int ordering_department_no) {
		this.ordering_department_no = ordering_department_no;
	}
	
	
}
