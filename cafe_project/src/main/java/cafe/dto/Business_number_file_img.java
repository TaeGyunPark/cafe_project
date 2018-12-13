package cafe.dto;

public class Business_number_file_img {
	private int cafe_no;
	private String business_number_file_origin_name;
	private String business_number_file_stored_name;
	private int business_number_file_size;
	
	
	@Override
	public String toString() {
		return "Business_number_file_img [cafe_no=" + cafe_no + ", business_number_file_origin_name="
				+ business_number_file_origin_name + ", business_number_file_stored_name="
				+ business_number_file_stored_name + ", business_number_file_size=" + business_number_file_size + "]";
	}


	public int getCafe_no() {
		return cafe_no;
	}


	public void setCafe_no(int cafe_no) {
		this.cafe_no = cafe_no;
	}


	public String getBusiness_number_file_origin_name() {
		return business_number_file_origin_name;
	}


	public void setBusiness_number_file_origin_name(String business_number_file_origin_name) {
		this.business_number_file_origin_name = business_number_file_origin_name;
	}


	public String getBusiness_number_file_stored_name() {
		return business_number_file_stored_name;
	}


	public void setBusiness_number_file_stored_name(String business_number_file_stored_name) {
		this.business_number_file_stored_name = business_number_file_stored_name;
	}


	public int getBusiness_number_file_size() {
		return business_number_file_size;
	}


	public void setBusiness_number_file_size(int business_number_file_size) {
		this.business_number_file_size = business_number_file_size;
	}
	
	
	
}
