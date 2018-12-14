package cafe.controller.menu_management;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import cafe.dto.Cafe_menu_category;
import cafe.service.face.Menu_Management_Service;


@Controller
public class Menu_Management_Controller {

	@Autowired ServletContext context;
	@Autowired Menu_Management_Service menu_management_service;
	
	private static final Logger logger = LoggerFactory.getLogger(Menu_Management_Controller.class);

	
	@RequestMapping(value="/category_insert", method=RequestMethod.GET)
	public ModelAndView category_insert() {
	
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("menu_management/category_insert");
		
		return mav;
	}
	
	@RequestMapping(value="/category_insert", method=RequestMethod.POST)
//	public ModelAndView category_insert_proc(@RequestParam(value="category_name") String category_name, @RequestParam(value="category_content") String category_content, @RequestParam(value="category_file") MultipartFile fileupload) {
		public ModelAndView category_insert_proc(String category_name, String category_explanation, @RequestParam(value="category_file") MultipartFile fileupload) {
		ModelAndView mav = new ModelAndView();
		
		logger.info(category_name);
		logger.info(category_explanation);
		logger.info(fileupload.getOriginalFilename());
		
		menu_management_service.insertcategory(context, fileupload, category_name, category_explanation);

		mav.setViewName("menu_management/category_insert");
		
		return mav;
	}
	

	@RequestMapping(value="/category_list", method=RequestMethod.GET)
//	public void category_list() {
	public ModelAndView category_list() {
		
		ModelAndView mav = new ModelAndView();
		List<Cafe_menu_category> list = new ArrayList<Cafe_menu_category>();
		
		list=menu_management_service.category_selectAll();
		
		logger.info(list.toString());
		
//		String path = context.getRealPath("resources/category_img");
		
		mav.addObject("list", list);
		mav.setViewName("menu_management/category_list");
		
		return mav;
	}
}
