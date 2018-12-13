package cafe.service.face;

import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.web.multipart.MultipartFile;

public interface Menu_Management_Service {

	public void insertcategory(ServletContext context, MultipartFile file, String category_name,
			String category_content);
	
	public List category_selectAll();
}
