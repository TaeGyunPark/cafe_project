package cafe.dto;

import java.util.Date;

public class Cafe_io {
	private int io_no;
	private int cafe_no;
	private int stock_no;
	private String stock_name;
	private int io_check;
	private Date io_date;
	private int io_quantity;
	private String stock_unit;
	private int stock_unit_price;
	private int io_total_price;
	private String ordering_department_name;
	private String io_remarks;
	
	
	@Override
	public String toString() {
		return "Cafe_io [io_no=" + io_no + ", cafe_no=" + cafe_no + ", stock_no=" + stock_no + ", stock_name="
				+ stock_name + ", io_check=" + io_check + ", io_date=" + io_date + ", io_quantity=" + io_quantity
				+ ", stock_unit=" + stock_unit + ", stock_unit_price=" + stock_unit_price + ", io_total_price="
				+ io_total_price + ", ordering_department_name=" + ordering_department_name + ", io_remarks="
				+ io_remarks + "]";
	}


	public int getIo_no() {
		return io_no;
	}


	public void setIo_no(int io_no) {
		this.io_no = io_no;
	}


	public int getCafe_no() {
		return cafe_no;
	}


	public void setCafe_no(int cafe_no) {
		this.cafe_no = cafe_no;
	}


	public int getStock_no() {
		return stock_no;
	}


	public void setStock_no(int stock_no) {
		this.stock_no = stock_no;
	}


	public String getStock_name() {
		return stock_name;
	}


	public void setStock_name(String stock_name) {
		this.stock_name = stock_name;
	}


	public int getIo_check() {
		return io_check;
	}


	public void setIo_check(int io_check) {
		this.io_check = io_check;
	}


	public Date getIo_date() {
		return io_date;
	}


	public void setIo_date(Date io_date) {
		this.io_date = io_date;
	}


	public int getIo_quantity() {
		return io_quantity;
	}


	public void setIo_quantity(int io_quantity) {
		this.io_quantity = io_quantity;
	}


	public String getStock_unit() {
		return stock_unit;
	}


	public void setStock_unit(String stock_unit) {
		this.stock_unit = stock_unit;
	}


	public int getStock_unit_price() {
		return stock_unit_price;
	}


	public void setStock_unit_price(int stock_unit_price) {
		this.stock_unit_price = stock_unit_price;
	}


	public int getIo_total_price() {
		return io_total_price;
	}


	public void setIo_total_price(int io_total_price) {
		this.io_total_price = io_total_price;
	}


	public String getOrdering_department_name() {
		return ordering_department_name;
	}


	public void setOrdering_department_name(String ordering_department_name) {
		this.ordering_department_name = ordering_department_name;
	}


	public String getIo_remarks() {
		return io_remarks;
	}


	public void setIo_remarks(String io_remarks) {
		this.io_remarks = io_remarks;
	}
	
	
	
	
	
}
