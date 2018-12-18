package cafe.dao.face;

import java.util.List;

import cafe.dto.Cafe_menu_category;

public interface Menu_Management_Dao {
	public void category_insert(Cafe_menu_category cafe_menu_category);
	
	public List category_selectAll();
	
	public Cafe_menu_category category_select(int category_no);
	
	public void category_update(Cafe_menu_category cafe_menu_category);
	
	public void categoey_delete(Cafe_menu_category cafe_menu_category);
	
}
