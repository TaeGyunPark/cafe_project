package cafe.dto;

public class Cafe_business_menu {
	private int menu_no;
	private int cafe_no;
	private String menu_name;
	private int menu_price;
	private String menu_category_name;
	private int menu_image_no;
	private String menu_explanation;
	private String menu_temperature;
	
	
	@Override
	public String toString() {
		return "Cafe_business_menu [menu_no=" + menu_no + ", cafe_no=" + cafe_no + ", menu_name=" + menu_name
				+ ", menu_price=" + menu_price + ", menu_category_name=" + menu_category_name + ", menu_image_no="
				+ menu_image_no + ", menu_explanation=" + menu_explanation + ", menu_temperature=" + menu_temperature
				+ "]";
	}


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


	public String getMenu_category_name() {
		return menu_category_name;
	}


	public void setMenu_category_name(String menu_category_name) {
		this.menu_category_name = menu_category_name;
	}


	public int getMenu_image_no() {
		return menu_image_no;
	}


	public void setMenu_image_no(int menu_image_no) {
		this.menu_image_no = menu_image_no;
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
	
	
	
	
}
