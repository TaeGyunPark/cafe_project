package cafe.dto;

public class Tag {
	private int tag_no;
	private String tag_name;
	private int review_no;
	
	
	@Override
	public String toString() {
		return "Tag [tag_no=" + tag_no + ", tag_name=" + tag_name + ", review_no=" + review_no + "]";
	}


	public int getTag_no() {
		return tag_no;
	}


	public void setTag_no(int tag_no) {
		this.tag_no = tag_no;
	}


	public String getTag_name() {
		return tag_name;
	}


	public void setTag_name(String tag_name) {
		this.tag_name = tag_name;
	}


	public int getReview_no() {
		return review_no;
	}


	public void setReview_no(int review_no) {
		this.review_no = review_no;
	}
	
	
	
	
}
