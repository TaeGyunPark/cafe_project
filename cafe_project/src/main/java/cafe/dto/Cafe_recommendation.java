package cafe.dto;

public class Cafe_recommendation {
   
   private int cafe_no;
    private String customer_nick;
   @Override
   public String toString() {
      return "Cafe_recommendation [cafe_no=" + cafe_no + ", customer_nick=" + customer_nick + "]";
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
   
   

   
   
}