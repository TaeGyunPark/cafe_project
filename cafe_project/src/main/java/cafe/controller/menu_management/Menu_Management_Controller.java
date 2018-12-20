package cafe.controller.menu_management;

import java.lang.ProcessBuilder.Redirect;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.reflection.SystemMetaObject;
import org.omg.CORBA.Request;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import cafe.dto.Cafe_business_menu;
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
		public String category_insert_proc(String category_name, String category_explanation, @RequestParam(value="category_file") MultipartFile fileupload) {
		ModelAndView mav = new ModelAndView();
		
	
		
		menu_management_service.insertcategory(context, fileupload, category_name, category_explanation);

		
		return "redirect:/category_list";
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
	
	@RequestMapping(value="/category_update", method=RequestMethod.GET)
	public ModelAndView category_update(int category_no) {
		Cafe_menu_category cafe_menu_category = new Cafe_menu_category();
		
		ModelAndView mav = new ModelAndView();
		//System.out.println(menu_category_no);
		
		
		cafe_menu_category=menu_management_service.category_select(category_no);
		
		mav.addObject("cafe_menu_category", cafe_menu_category);
		mav.setViewName("menu_management/category_update");
		
		return mav;
		
	}
	
	@RequestMapping(value="/category_update", method=RequestMethod.POST)
	public String category_update_proc(String category_name, String category_explanation, int category_no, @RequestParam(value="category_file") MultipartFile fileupload) {
		ModelAndView mav = new ModelAndView();
		
		
		menu_management_service.update_category(context, fileupload, category_name, category_explanation, category_no);
		
		
		
		return "redirect:/category_list";
	}
	
	@RequestMapping(value="/category_delete", method=RequestMethod.GET)
	public String category_delete(int category_no) {
		
		menu_management_service.delete_category(category_no);
		
		return "redirect:/category_list";
	}
	
	@RequestMapping(value="/menu_list", method=RequestMethod.GET)
	public ModelAndView menu_list() {
		ModelAndView mav = new ModelAndView();
		
		List<Cafe_business_menu> list = new ArrayList();

		list=menu_management_service.menu_selectAll();
		mav.addObject("list", list);
		mav.setViewName("menu_management/menu_list");
		return mav;
	}
	
	@RequestMapping(value="/menu_insert", method=RequestMethod.GET)
	public ModelAndView menu_insert() {
		ModelAndView mav = new ModelAndView();
		List<Cafe_menu_category> list = new ArrayList<>();
		
		list=menu_management_service.category_selectAll();
		
		mav.addObject("list", list);
		mav.setViewName("menu_management/menu_insert");
		return mav;
	}
	
	@RequestMapping(value="/menu_insert", method=RequestMethod.POST)
	public ModelAndView menu_insert_proc(String menu_name, int category_select, String menu_explanation, int menu_price, @RequestParam(value="temperature") String temperature, @RequestParam(value="menu_file") MultipartFile fileupload) {
		
		ModelAndView mav = new ModelAndView();
		List<Cafe_business_menu> list = new ArrayList();
//		System.out.println(menu_name);
//		System.out.println(category_select);
//		System.out.println(menu_explanation);
//		System.out.println(menu_price);
//		System.out.println(temperature);
//		System.out.println(fileupload);
		menu_management_service.insert_menu(context, fileupload, category_select, menu_name, menu_explanation, menu_price, temperature);
		
		list=menu_management_service.menu_selectAll();
		mav.addObject("list", list);
		mav.setViewName("redirect:/menu_list");
		

		
		return mav;
	}
	
	@RequestMapping(value="/menu_delete", method=RequestMethod.GET)
	public String menu_delete(int menu_no) {
		return null;
	}
	
	
	
}
