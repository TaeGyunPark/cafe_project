package cafe.dto;

public class Review {
   private int review_no;
   private int cafe_no;
   private String review_content;
   private String customer_nick;
   private int cafe_score;
   @Override
   public String toString() {
      return "Review [review_no=" + review_no + ", cafe_no=" + cafe_no + ", review_content=" + review_content
            + ", customer_nick=" + customer_nick + ", cafe_score=" + cafe_score + "]";
   }
   public int getReview_no() {
      return review_no;
   }
   public void setReview_no(int review_no) {
      this.review_no = review_no;
   }
   public int getCafe_no() {
      return cafe_no;
   }
   public void setCafe_no(int cafe_no) {
      this.cafe_no = cafe_no;
   }
   public String getReview_content() {
      return review_content;
   }
   public void setReview_content(String review_content) {
      this.review_content = review_content;
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