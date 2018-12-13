package cafe.dto;

public class Cafe_business_img {

	private int business_img_no;
	private int cafe_no;
	private int business_img_fileno;
	private String business_img_original_name;
	private String business_img_stored_name;
	private long business_img_filesize;
	
	
	@Override
	public String toString() {
		return "Cafe_business_img [business_img_no=" + business_img_no + ", cafe_no=" + cafe_no
				+ ", business_img_fileno=" + business_img_fileno + ", business_img_original_name="
				+ business_img_original_name + ", business_img_stored_name=" + business_img_stored_name
				+ ", business_img_filesize=" + business_img_filesize + "]";
	}


	public int getBusiness_img_no() {
		return business_img_no;
	}


	public void setBusiness_img_no(int business_img_no) {
		this.business_img_no = business_img_no;
	}


	public int getCafe_no() {
		return cafe_no;
	}


	public void setCafe_no(int cafe_no) {
		this.cafe_no = cafe_no;
	}


	public int getBusiness_img_fileno() {
		return business_img_fileno;
	}


	public void setBusiness_img_fileno(int business_img_fileno) {
		this.business_img_fileno = business_img_fileno;
	}


	public String getBusiness_img_original_name() {
		return business_img_original_name;
	}


	public void setBusiness_img_original_name(String business_img_original_name) {
		this.business_img_original_name = business_img_original_name;
	}


	public String getBusiness_img_stored_name() {
		return business_img_stored_name;
	}


	public void setBusiness_img_stored_name(String business_img_stored_name) {
		this.business_img_stored_name = business_img_stored_name;
	}


	public long getBusiness_img_filesize() {
		return business_img_filesize;
	}


	public void setBusiness_img_filesize(long business_img_filesize) {
		this.business_img_filesize = business_img_filesize;
	}
	
	
	
	

}
