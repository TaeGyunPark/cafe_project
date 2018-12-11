package cafe.dto;

import java.util.Date;

public class Pay {
	private int pay_no;
	private int pay_sum;
	private Date pay_time;
	private int pat_means_no;
	private int owner_check;
	
	
	@Override
	public String toString() {
		return "Pay [pay_no=" + pay_no + ", pay_sum=" + pay_sum + ", pay_time=" + pay_time + ", pat_means_no="
				+ pat_means_no + ", owner_check=" + owner_check + "]";
	}


	public int getPay_no() {
		return pay_no;
	}


	public void setPay_no(int pay_no) {
		this.pay_no = pay_no;
	}


	public int getPay_sum() {
		return pay_sum;
	}


	public void setPay_sum(int pay_sum) {
		this.pay_sum = pay_sum;
	}


	public Date getPay_time() {
		return pay_time;
	}


	public void setPay_time(Date pay_time) {
		this.pay_time = pay_time;
	}


	public int getPat_means_no() {
		return pat_means_no;
	}


	public void setPat_means_no(int pat_means_no) {
		this.pat_means_no = pat_means_no;
	}


	public int getOwner_check() {
		return owner_check;
	}


	public void setOwner_check(int owner_check) {
		this.owner_check = owner_check;
	}
	
	
	
}
