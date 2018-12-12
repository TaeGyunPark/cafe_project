package cafe.dto;

public class Average {
	private int average_no;
	private int average;
	private String customer_nick;
	private int review_no;
	
	// 주석 테스트 - 181212
	
	@Override
	public String toString() {
		return "Average [average_no=" + average_no + ", average=" + average + ", customer_nick=" + customer_nick
				+ ", review_no=" + review_no + "]";
	}


	public int getAverage_no() {
		return average_no;
	}


	public void setAverage_no(int average_no) {
		this.average_no = average_no;
	}


	public int getAverage() {
		return average;
	}


	public void setAverage(int average) {
		this.average = average;
	}


	public String getCustomer_nick() {
		return customer_nick;
	}


	public void setCustomer_nick(String customer_nick) {
		this.customer_nick = customer_nick;
	}


	public int getReview_no() {
		return review_no;
	}


	public void setReview_no(int review_no) {
		this.review_no = review_no;
	}
	
	
}
