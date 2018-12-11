package cafe.dto;

public class Pay_means {
	private int pay_means_no;
	private String pay_means_name;
	
	
	@Override
	public String toString() {
		return "Pay_means [pay_means_no=" + pay_means_no + ", pay_means_name=" + pay_means_name + "]";
	}


	public int getPay_means_no() {
		return pay_means_no;
	}


	public void setPay_means_no(int pay_means_no) {
		this.pay_means_no = pay_means_no;
	}


	public String getPay_means_name() {
		return pay_means_name;
	}


	public void setPay_means_name(String pay_means_name) {
		this.pay_means_name = pay_means_name;
	}
	
	
	
	
}
