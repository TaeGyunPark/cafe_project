package cafe.dto;

public class Report {
	private int report_no;
	private String report_category;
	private String report_writer;
	private int report_phone;
	private String report_email;
	private String report_title;
	private String report_content;
	private String report_file_original_name;
	private String report_file_stored_name;
	
	
	@Override
	public String toString() {
		return "Report [report_no=" + report_no + ", report_category=" + report_category + ", report_writer="
				+ report_writer + ", report_phone=" + report_phone + ", report_email=" + report_email
				+ ", report_title=" + report_title + ", report_content=" + report_content
				+ ", report_file_original_name=" + report_file_original_name + ", report_file_stored_name="
				+ report_file_stored_name + "]";
	}


	public int getReport_no() {
		return report_no;
	}


	public void setReport_no(int report_no) {
		this.report_no = report_no;
	}


	public String getReport_category() {
		return report_category;
	}


	public void setReport_category(String report_category) {
		this.report_category = report_category;
	}


	public String getReport_writer() {
		return report_writer;
	}


	public void setReport_writer(String report_writer) {
		this.report_writer = report_writer;
	}


	public int getReport_phone() {
		return report_phone;
	}


	public void setReport_phone(int report_phone) {
		this.report_phone = report_phone;
	}


	public String getReport_email() {
		return report_email;
	}


	public void setReport_email(String report_email) {
		this.report_email = report_email;
	}


	public String getReport_title() {
		return report_title;
	}


	public void setReport_title(String report_title) {
		this.report_title = report_title;
	}


	public String getReport_content() {
		return report_content;
	}


	public void setReport_content(String report_content) {
		this.report_content = report_content;
	}


	public String getReport_file_original_name() {
		return report_file_original_name;
	}


	public void setReport_file_original_name(String report_file_original_name) {
		this.report_file_original_name = report_file_original_name;
	}


	public String getReport_file_stored_name() {
		return report_file_stored_name;
	}


	public void setReport_file_stored_name(String report_file_stored_name) {
		this.report_file_stored_name = report_file_stored_name;
	}
	
	
	
}
