package cafe.dto;

public class One_to_one_contact {
   private int contact_no;
   private String contact_writer;
   private int contact_phone;
   private String contact_category;
   private String contact_title;
   private String contact_content;
   private String contact_file_original_name;
   private String contact_file_stored_name;
   private String contact_email;
   @Override
   public String toString() {
      return "One_to_one_contact [contact_no=" + contact_no + ", contact_writer=" + contact_writer
            + ", contact_phone=" + contact_phone + ", contact_category=" + contact_category + ", contact_title="
            + contact_title + ", contact_content=" + contact_content + ", contact_file_original_name="
            + contact_file_original_name + ", contact_file_stored_name=" + contact_file_stored_name
            + ", contact_email=" + contact_email + "]";
   }
   public int getContact_no() {
      return contact_no;
   }
   public void setContact_no(int contact_no) {
      this.contact_no = contact_no;
   }
   public String getContact_writer() {
      return contact_writer;
   }
   public void setContact_writer(String contact_writer) {
      this.contact_writer = contact_writer;
   }
   public int getContact_phone() {
      return contact_phone;
   }
   public void setContact_phone(int contact_phone) {
      this.contact_phone = contact_phone;
   }
   public String getContact_category() {
      return contact_category;
   }
   public void setContact_category(String contact_category) {
      this.contact_category = contact_category;
   }
   public String getContact_title() {
      return contact_title;
   }
   public void setContact_title(String contact_title) {
      this.contact_title = contact_title;
   }
   public String getContact_content() {
      return contact_content;
   }
   public void setContact_content(String contact_content) {
      this.contact_content = contact_content;
   }
   public String getContact_file_original_name() {
      return contact_file_original_name;
   }
   public void setContact_file_original_name(String contact_file_original_name) {
      this.contact_file_original_name = contact_file_original_name;
   }
   public String getContact_file_stored_name() {
      return contact_file_stored_name;
   }
   public void setContact_file_stored_name(String contact_file_stored_name) {
      this.contact_file_stored_name = contact_file_stored_name;
   }
   public String getContact_email() {
      return contact_email;
   }
   public void setContact_email(String contact_email) {
      this.contact_email = contact_email;
   }
   
}