package cafe.dto;

public class Cafe_recommendation {
	
	private int customer_no;
    private String customer_nick;
	private int cafe_recommendation;
	
	@Override
	public String toString() {
		return "Cafe_recommendation [customer_no=" + customer_no + ", customer_nick=" + customer_nick
				+ ", cafe_recommendation=" + cafe_recommendation + "]";
	}

	public int getCustomer_no() {
		return customer_no;
	}

	public void setCustomer_no(int customer_no) {
		this.customer_no = customer_no;
	}

	public String getCustomer_nick() {
		return customer_nick;
	}

	public void setCustomer_nick(String customer_nick) {
		this.customer_nick = customer_nick;
	}

	public int getCafe_recommendation() {
		return cafe_recommendation;
	}

	public void setCafe_recommendation(int cafe_recommendation) {
		this.cafe_recommendation = cafe_recommendation;
	}
	
	
	
}
