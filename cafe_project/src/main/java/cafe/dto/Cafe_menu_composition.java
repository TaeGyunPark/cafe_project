package cafe.dto;

public class Cafe_menu_composition {
	private int composition_no;
	private int cafe_no;
	private int menu_no;
	private int composition_order;
	private int stock_no;
	private int composition_quantity;
	private int composition_unit;
	
	
	@Override
	public String toString() {
		return "Cafe_menu_composition [composition_no=" + composition_no + ", cafe_no=" + cafe_no + ", menu_no="
				+ menu_no + ", composition_order=" + composition_order + ", stock_no=" + stock_no
				+ ", composition_quantity=" + composition_quantity + ", composition_unit=" + composition_unit + "]";
	}


	public int getComposition_no() {
		return composition_no;
	}


	public void setComposition_no(int composition_no) {
		this.composition_no = composition_no;
	}


	public int getCafe_no() {
		return cafe_no;
	}


	public void setCafe_no(int cafe_no) {
		this.cafe_no = cafe_no;
	}


	public int getMenu_no() {
		return menu_no;
	}


	public void setMenu_no(int menu_no) {
		this.menu_no = menu_no;
	}


	public int getComposition_order() {
		return composition_order;
	}


	public void setComposition_order(int composition_order) {
		this.composition_order = composition_order;
	}


	public int getStock_no() {
		return stock_no;
	}


	public void setStock_no(int stock_no) {
		this.stock_no = stock_no;
	}


	public int getComposition_quantity() {
		return composition_quantity;
	}


	public void setComposition_quantity(int composition_quantity) {
		this.composition_quantity = composition_quantity;
	}


	public int getComposition_unit() {
		return composition_unit;
	}


	public void setComposition_unit(int composition_unit) {
		this.composition_unit = composition_unit;
	}
	
	
	
}
