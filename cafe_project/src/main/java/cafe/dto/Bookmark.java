package cafe.dto;

public class Bookmark {
	private int bookmark_no;
	private int customer_no;
	private int cafe_no;
	
	
	@Override
	public String toString() {
		return "Bookmark [bookmark_no=" + bookmark_no + ", customer_no=" + customer_no + ", cafe_no=" + cafe_no + "]";
	}


	public int getBookmark_no() {
		return bookmark_no;
	}


	public void setBookmark_no(int bookmark_no) {
		this.bookmark_no = bookmark_no;
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
	
	
	
}
