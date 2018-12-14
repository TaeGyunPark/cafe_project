package cafe.dto;

public class Cafe_score {
   private int cafe_no;
   private String customer_nick;
   private int cafe_score;
   
   @Override
   public String toString() {
      return "Cafe_score [cafe_no=" + cafe_no + ", customer_nick=" + customer_nick + ", cafe_score=" + cafe_score
            + "]";
   }
   public int getCafe_no() {
      return cafe_no;
   }
   public void setCafe_no(int cafe_no) {
      this.cafe_no = cafe_no;
   }
   public String getCustomer_nick() {
      return customer_nick;
   }
   public void setCustomer_nick(String customer_nick) {
      this.customer_nick = customer_nick;
   }
   public int getCafe_score() {
      return cafe_score;
   }
   public void setCafe_score(int cafe_score) {
      this.cafe_score = cafe_score;
   }
   
   
   
}
   