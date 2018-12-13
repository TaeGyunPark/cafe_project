package cafe.dto;

public class Cafe_business {
	private int cafe_no;
	private String business_phone;
	private String business_address;
	private String business_number_fileno;
	private int cafe_hit;
	private int cafe_score;
	private int cafe_recommendation;
	private String cafe_name;
	private String cafe_explanation;
	
	@Override
	public String toString() {
		return "Cafe_business [cafe_no=" + cafe_no + ", business_phone=" + business_phone + ", business_address="
				+ business_address + ", business_number_fileno=" + business_number_fileno + ", cafe_hit=" + cafe_hit
				+ ", cafe_score=" + cafe_score + ", cafe_recommendation=" + cafe_recommendation + ", cafe_name="
				+ cafe_name + ", cafe_explanation=" + cafe_explanation + "]";
	}

	public int getCafe_no() {
		return cafe_no;
	}

	public void setCafe_no(int cafe_no) {
		this.cafe_no = cafe_no;
	}

	public String getBusiness_phone() {
		return business_phone;
	}

	public void setBusiness_phone(String business_phone) {
		this.business_phone = business_phone;
	}

	public String getBusiness_address() {
		return business_address;
	}

	public void setBusiness_address(String business_address) {
		this.business_address = business_address;
	}

	public String getBusiness_number_fileno() {
		return business_number_fileno;
	}

	public void setBusiness_number_fileno(String business_number_fileno) {
		this.business_number_fileno = business_number_fileno;
	}

	public int getCafe_hit() {
		return cafe_hit;
	}

	public void setCafe_hit(int cafe_hit) {
		this.cafe_hit = cafe_hit;
	}

	public int getCafe_score() {
		return cafe_score;
	}

	public void setCafe_score(int cafe_score) {
		this.cafe_score = cafe_score;
	}

	public int getCafe_recommendation() {
		return cafe_recommendation;
	}

	public void setCafe_recommendation(int cafe_recommendation) {
		this.cafe_recommendation = cafe_recommendation;
	}

	public String getCafe_name() {
		return cafe_name;
	}

	public void setCafe_name(String cafe_name) {
		this.cafe_name = cafe_name;
	}

	public String getCafe_explanation() {
		return cafe_explanation;
	}

	public void setCafe_explanation(String cafe_explanation) {
		this.cafe_explanation = cafe_explanation;
	}
	
	
	
	
	
	
	
}
