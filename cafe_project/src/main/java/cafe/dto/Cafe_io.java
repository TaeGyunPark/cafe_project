package cafe.dto;

import java.util.Date;

public class Cafe_io {

   // DB CAFE_IO TABLE 에 있는 변수 
   private int cafe_no;       // 카페고유번호
   private int stock_no;      // 재고고유번호
   private int io_no;         // 입출고 고유번호
   private int io_check;       // 입고출고 구분
   private Date io_date;      // 날짜
   private int io_quantity;   // 입출고 수량
   private int io_total_price;   // 총 가격 = 단위가격 * 입출고 수량 ( dto에서 계산해서 DB에 저장 )
   private String io_remarks;   // 입출고 비고

   // ** dto 에만 있는 변수 ( 입출고 LIST 출력을 위해 )
   private String ordering_department_name; // ** 발주처 
   private String stock_name;            // ** 재료명
   private int stock_unit_price;         // ** 단위가격 (5,000)
   private int stock_current_amount;      // ** 현재 수량 ( 5팩 ) 
   private String stock_ordering_unit;      // ** 단위 ( 팩, 봉 )
   
   @Override
   public String toString() {
      return "Cafe_io [cafe_no=" + cafe_no + ", stock_no=" + stock_no + ", io_no=" + io_no + ", io_check=" + io_check
            + ", io_date=" + io_date + ", io_quantity=" + io_quantity + ", io_total_price=" + io_total_price
            + ", io_remarks=" + io_remarks + ", ordering_department_name=" + ordering_department_name
            + ", stock_name=" + stock_name + ", stock_unit_price=" + stock_unit_price + ", stock_current_amount="
            + stock_current_amount + ", stock_ordering_unit=" + stock_ordering_unit + "]";
   }

   public int getCafe_no() {
      return cafe_no;
   }

   public void setCafe_no(int cafe_no) {
      this.cafe_no = cafe_no;
   }

   public int getStock_no() {
      return stock_no;
   }

   public void setStock_no(int stock_no) {
      this.stock_no = stock_no;
   }

   public int getIo_no() {
      return io_no;
   }

   public void setIo_no(int io_no) {
      this.io_no = io_no;
   }

   public int getIo_check() {
      return io_check;
   }

   public void setIo_check(int io_check) {
      this.io_check = io_check;
   }

   public Date getIo_date() {
      return io_date;
   }

   public void setIo_date(Date io_date) {
      this.io_date = io_date;
   }

   public int getIo_quantity() {
      return io_quantity;
   }

   public void setIo_quantity(int io_quantity) {
      this.io_quantity = io_quantity;
   }

   public int getIo_total_price() {
      return io_total_price;
   }

   public void setIo_total_price(int io_total_price) {
      this.io_total_price = io_total_price;
   }

   public String getIo_remarks() {
      return io_remarks;
   }

   public void setIo_remarks(String io_remarks) {
      this.io_remarks = io_remarks;
   }

   public String getOrdering_department_name() {
      return ordering_department_name;
   }

   public void setOrdering_department_name(String ordering_department_name) {
      this.ordering_department_name = ordering_department_name;
   }

   public String getStock_name() {
      return stock_name;
   }

   public void setStock_name(String stock_name) {
      this.stock_name = stock_name;
   }

   public int getStock_unit_price() {
      return stock_unit_price;
   }

   public void setStock_unit_price(int stock_unit_price) {
      this.stock_unit_price = stock_unit_price;
   }

   public int getStock_current_amount() {
      return stock_current_amount;
   }

   public void setStock_current_amount(int stock_current_amount) {
      this.stock_current_amount = stock_current_amount;
   }

   public String getStock_ordering_unit() {
      return stock_ordering_unit;
   }

   public void setStock_ordering_unit(String stock_ordering_unit) {
      this.stock_ordering_unit = stock_ordering_unit;
   }
   
}