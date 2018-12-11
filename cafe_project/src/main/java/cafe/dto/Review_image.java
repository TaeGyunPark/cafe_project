package cafe.dto;

public class Review_image {
	private int review_image_no;
	private String review_image_origin_name;
	private String review_image_stored_name;
	private int review_no;
	private int review_image_size;
	
	
	@Override
	public String toString() {
		return "Review_image [review_image_no=" + review_image_no + ", review_image_origin_name="
				+ review_image_origin_name + ", review_image_stored_name=" + review_image_stored_name + ", review_no="
				+ review_no + ", review_image_size=" + review_image_size + "]";
	}


	public int getReview_image_no() {
		return review_image_no;
	}


	public void setReview_image_no(int review_image_no) {
		this.review_image_no = review_image_no;
	}


	public String getReview_image_origin_name() {
		return review_image_origin_name;
	}


	public void setReview_image_origin_name(String review_image_origin_name) {
		this.review_image_origin_name = review_image_origin_name;
	}


	public String getReview_image_stored_name() {
		return review_image_stored_name;
	}


	public void setReview_image_stored_name(String review_image_stored_name) {
		this.review_image_stored_name = review_image_stored_name;
	}


	public int getReview_no() {
		return review_no;
	}


	public void setReview_no(int review_no) {
		this.review_no = review_no;
	}


	public int getReview_image_size() {
		return review_image_size;
	}


	public void setReview_image_size(int review_image_size) {
		this.review_image_size = review_image_size;
	}
	
	
	
}
