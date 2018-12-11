package cafe.dto;

import java.util.Date;

public class Notice {
	private int notice_no;
	private String notice_category;
	private String notice_content;
	private String notice_title;
	private Date notice_date;
	private String notice_writer;
	private int notice_hit;
	
	
	@Override
	public String toString() {
		return "Notice [notice_no=" + notice_no + ", notice_category=" + notice_category + ", notice_content="
				+ notice_content + ", notice_title=" + notice_title + ", notice_date=" + notice_date
				+ ", notice_writer=" + notice_writer + ", notice_hit=" + notice_hit + "]";
	}


	public int getNotice_no() {
		return notice_no;
	}


	public void setNotice_no(int notice_no) {
		this.notice_no = notice_no;
	}


	public String getNotice_category() {
		return notice_category;
	}


	public void setNotice_category(String notice_category) {
		this.notice_category = notice_category;
	}


	public String getNotice_content() {
		return notice_content;
	}


	public void setNotice_content(String notice_content) {
		this.notice_content = notice_content;
	}


	public String getNotice_title() {
		return notice_title;
	}


	public void setNotice_title(String notice_title) {
		this.notice_title = notice_title;
	}


	public Date getNotice_date() {
		return notice_date;
	}


	public void setNotice_date(Date notice_date) {
		this.notice_date = notice_date;
	}


	public String getNotice_writer() {
		return notice_writer;
	}


	public void setNotice_writer(String notice_writer) {
		this.notice_writer = notice_writer;
	}


	public int getNotice_hit() {
		return notice_hit;
	}


	public void setNotice_hit(int notice_hit) {
		this.notice_hit = notice_hit;
	}
	
	
}
