package cafe.dto;

public class One_to_one_answer {
	private int contact_no;
	private String contact_answer_title;
	private String contact_answer_content;
	private String contact_answer_toggle;
	
	
	@Override
	public String toString() {
		return "One_to_one_answer [contact_no=" + contact_no + ", contact_answer_title=" + contact_answer_title
				+ ", contact_answer_content=" + contact_answer_content + ", contact_answer_toggle="
				+ contact_answer_toggle + "]";
	}


	public int getContact_no() {
		return contact_no;
	}


	public void setContact_no(int contact_no) {
		this.contact_no = contact_no;
	}


	public String getContact_answer_title() {
		return contact_answer_title;
	}


	public void setContact_answer_title(String contact_answer_title) {
		this.contact_answer_title = contact_answer_title;
	}


	public String getContact_answer_content() {
		return contact_answer_content;
	}


	public void setContact_answer_content(String contact_answer_content) {
		this.contact_answer_content = contact_answer_content;
	}


	public String getContact_answer_toggle() {
		return contact_answer_toggle;
	}


	public void setContact_answer_toggle(String contact_answer_toggle) {
		this.contact_answer_toggle = contact_answer_toggle;
	}
	
	
	
	
	
}
