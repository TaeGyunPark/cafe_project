package cafe.service.impl;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import cafe.dao.face.Menu_Management_Dao;
import cafe.dto.Cafe_menu_category;
import cafe.service.face.Menu_Management_Service;

@Service
public class Menu_Management_ServiceImpl implements Menu_Management_Service {

	@Autowired
	Menu_Management_Dao menu_Management_Dao;

	@Override
	public void insertcategory(ServletContext context, MultipartFile file, String category_name,
			String category_explanation) {

		Cafe_menu_category cafe_menu_category = new Cafe_menu_category();

		// UUID, 고유 식별자
		String uId = UUID.randomUUID().toString();

		// 파일이 저장될 경로
		String stored = context.getRealPath("resources/category_img");

		// 저장될 파일의 이름
		String name = file.getOriginalFilename() + "_" + uId;

		// 파일객체
		File dest = new File(stored, name);

		// 파일 저장(업로드)
		try {
			file.transferTo(dest);
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		cafe_menu_category.setMenu_category_name(category_name);
		cafe_menu_category.setMenu_category_img_origin_name(file.getOriginalFilename());
		cafe_menu_category.setMenu_category_img_stored_name(name);
		cafe_menu_category.setMenu_category_explanation(category_explanation);

	}
}
