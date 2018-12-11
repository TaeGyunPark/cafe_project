package cafe.dto;

public class Qna {
	private int qna_no;
	private String qna_category;
	private String qan_content;
	
	
	@Override
	public String toString() {
		return "Qna [qna_no=" + qna_no + ", qna_category=" + qna_category + ", qan_content=" + qan_content + "]";
	}


	public int getQna_no() {
		return qna_no;
	}


	public void setQna_no(int qna_no) {
		this.qna_no = qna_no;
	}


	public String getQna_category() {
		return qna_category;
	}


	public void setQna_category(String qna_category) {
		this.qna_category = qna_category;
	}


	public String getQan_content() {
		return qan_content;
	}


	public void setQan_content(String qan_content) {
		this.qan_content = qan_content;
	}
	
	
	
}
