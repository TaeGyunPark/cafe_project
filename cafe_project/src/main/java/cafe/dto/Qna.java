package cafe.dto;

public class Qna {
	private int qna_no;
	private String qna_category;
	private String qnA_question;
	private String QnA_answer;
	
	@Override
	public String toString() {
		return "Qna [qna_no=" + qna_no + ", qna_category=" + qna_category + ", qnA_question=" + qnA_question
				+ ", QnA_answer=" + QnA_answer + "]";
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

	public String getQnA_question() {
		return qnA_question;
	}

	public void setQnA_question(String qnA_question) {
		this.qnA_question = qnA_question;
	}

	public String getQnA_answer() {
		return QnA_answer;
	}

	public void setQnA_answer(String qnA_answer) {
		QnA_answer = qnA_answer;
	}
	
	
	
	
	
	
}
