package cafe.dto;

import java.util.Date;

public class Cafe_operation {

	private int operation_no;
	private int cafe_no;
	private String operation_day;
	private Date operation_open_time;
	private Date operation_close_time;
	
	
	public int getOperation_no() {
		return operation_no;
	}


	public void setOperation_no(int operation_no) {
		this.operation_no = operation_no;
	}


	public int getCafe_no() {
		return cafe_no;
	}


	public void setCafe_no(int cafe_no) {
		this.cafe_no = cafe_no;
	}


	public String getOperation_day() {
		return operation_day;
	}


	public void setOperation_day(String operation_day) {
		this.operation_day = operation_day;
	}


	public Date getOperation_open_time() {
		return operation_open_time;
	}


	public void setOperation_open_time(Date operation_open_time) {
		this.operation_open_time = operation_open_time;
	}


	public Date getOperation_close_time() {
		return operation_close_time;
	}


	public void setOperation_close_time(Date operation_close_time) {
		this.operation_close_time = operation_close_time;
	}


	@Override
	public String toString() {
		return "Cafe_operation [operation_no=" + operation_no + ", cafe_no=" + cafe_no + ", operation_day="
				+ operation_day + ", operation_open_time=" + operation_open_time + ", operation_close_time="
				+ operation_close_time + "]";
	}
	
	
	
}
