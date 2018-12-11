package cafe.dto;

public class Cafe_menu_category {
	private int menu_category_no;
	private int cafe_no;
	private String menu_category_name;
	private int menu_category_image_no;
	
	
	@Override
	public String toString() {
		return "Cafe_menu_category [menu_category_no=" + menu_category_no + ", cafe_no=" + cafe_no
				+ ", menu_category_name=" + menu_category_name + ", menu_category_image_no=" + menu_category_image_no
				+ "]";
	}


	public int getMenu_category_no() {
		return menu_category_no;
	}


	public void setMenu_category_no(int menu_category_no) {
		this.menu_category_no = menu_category_no;
	}


	public int getCafe_no() {
		return cafe_no;
	}


	public void setCafe_no(int cafe_no) {
		this.cafe_no = cafe_no;
	}


	public String getMenu_category_name() {
		return menu_category_name;
	}


	public void setMenu_category_name(String menu_category_name) {
		this.menu_category_name = menu_category_name;
	}


	public int getMenu_category_image_no() {
		return menu_category_image_no;
	}


	public void setMenu_category_image_no(int menu_category_image_no) {
		this.menu_category_image_no = menu_category_image_no;
	}
	
	
	
}
