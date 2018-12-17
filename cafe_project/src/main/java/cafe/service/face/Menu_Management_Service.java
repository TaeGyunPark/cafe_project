package cafe.service.face;

import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.web.multipart.MultipartFile;

import cafe.dto.Cafe_menu_category;

public interface Menu_Management_Service {

	public void insertcategory(ServletContext context, MultipartFile file, String category_name,
			String category_content);
	
	public List category_selectAll();
	
	public Cafe_menu_category category_select(Cafe_menu_category cafe_menu_category);
	
	public void update_category(ServletContext context, MultipartFile file, String category_name,
			String category_explanation);
}
