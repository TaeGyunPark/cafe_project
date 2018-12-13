package cafe.controller.menu_management;

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


@Controller
public class Menu_Management_Controller {

	@Autowired ServletContext context;
	
	private static final Logger logger = LoggerFactory.getLogger(Menu_Management_Controller.class);

	
	@RequestMapping(value="/category_insert", method=RequestMethod.GET)
	public ModelAndView category_insert() {
	
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("menu_management/category_insert");
		
		return mav;
	}
	
	@RequestMapping(value="/category_insert", method=RequestMethod.POST)
//	public ModelAndView category_insert_proc(@RequestParam(value="category_name") String category_name, @RequestParam(value="category_content") String category_content, @RequestParam(value="category_file") MultipartFile fileupload) {
		public ModelAndView category_insert_proc(String category_name, String category_content, @RequestParam(value="category_file") MultipartFile fileupload) {
		ModelAndView mav = new ModelAndView();
		
		logger.info(category_name);
		logger.info(category_content);
		logger.info(fileupload.getOriginalFilename());
		
		
		
		
		
		
		mav.setViewName("menu_management/category_insert");
		
		return mav;
	}
}
