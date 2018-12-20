package cafe.dto;

public class Cafe_business_menu {
	private int menu_no;
	private int cafe_no;
	private String menu_name;
	private int menu_price;
	private int menu_category_no;
	private String menu_image_origin_name;
	private String menu_image_stored_name;
	private String menu_explanation;
	private String menu_temperature;
	public int getMenu_no() {
		return menu_no;
	}
	public void setMenu_no(int menu_no) {
		this.menu_no = menu_no;
	}
	public int getCafe_no() {
		return cafe_no;
	}
	public void setCafe_no(int cafe_no) {
		this.cafe_no = cafe_no;
	}
	public String getMenu_name() {
		return menu_name;
	}
	public void setMenu_name(String menu_name) {
		this.menu_name = menu_name;
	}
	public int getMenu_price() {
		return menu_price;
	}
	public void setMenu_price(int menu_price) {
		this.menu_price = menu_price;
	}
	public int getMenu_category_no() {
		return menu_category_no;
	}
	public void setMenu_category_no(int menu_category_no) {
		this.menu_category_no = menu_category_no;
	}
	public String getMenu_image_origin_name() {
		return menu_image_origin_name;
	}
	public void setMenu_image_origin_name(String menu_image_origin_name) {
		this.menu_image_origin_name = menu_image_origin_name;
	}
	public String getMenu_image_stored_name() {
		return menu_image_stored_name;
	}
	public void setMenu_image_stored_name(String menu_image_stored_name) {
		this.menu_image_stored_name = menu_image_stored_name;
	}
	public String getMenu_explanation() {
		return menu_explanation;
	}
	public void setMenu_explanation(String menu_explanation) {
		this.menu_explanation = menu_explanation;
	}
	public String getMenu_temperature() {
		return menu_temperature;
	}
	public void setMenu_temperature(String menu_temperature) {
		this.menu_temperature = menu_temperature;
	}
	
	@Override
	public String toString() {
		return "Cafe_business_menu [menu_no=" + menu_no + ", cafe_no=" + cafe_no + ", menu_name=" + menu_name
				+ ", menu_price=" + menu_price + ", menu_category_no=" + menu_category_no + ", menu_image_origin_name="
				+ menu_image_origin_name + ", menu_image_stored_name=" + menu_image_stored_name + ", menu_explanation="
				+ menu_explanation + ", menu_temperature=" + menu_temperature + "]";
	}
	
	
	
	
	
	
}
