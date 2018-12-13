package cafe.dto;

public class Cafe_menu_category {
	private int menu_category_no;
	private int cafe_no;
	private String menu_category_name;
	private int menu_category_image_no;
	private String menu_category_img_origin_name;
	private String menu_category_img_stored_name;
	private String menu_category_explanation;
	
	@Override
	public String toString() {
		return "Cafe_menu_category [menu_category_no=" + menu_category_no + ", cafe_no=" + cafe_no
				+ ", menu_category_name=" + menu_category_name + ", menu_category_image_no=" + menu_category_image_no
				+ ", menu_category_img_origin_name=" + menu_category_img_origin_name
				+ ", menu_category_img_stored_name=" + menu_category_img_stored_name + ", menu_category_explanation="
				+ menu_category_explanation + "]";
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

	public String getMenu_category_img_origin_name() {
		return menu_category_img_origin_name;
	}

	public void setMenu_category_img_origin_name(String menu_category_img_origin_name) {
		this.menu_category_img_origin_name = menu_category_img_origin_name;
	}

	public String getMenu_category_img_stored_name() {
		return menu_category_img_stored_name;
	}

	public void setMenu_category_img_stored_name(String menu_category_img_stored_name) {
		this.menu_category_img_stored_name = menu_category_img_stored_name;
	}

	public String getMenu_category_explanation() {
		return menu_category_explanation;
	}

	public void setMenu_category_explanation(String menu_category_explanation) {
		this.menu_category_explanation = menu_category_explanation;
	}
	
	
	
	
	
}
