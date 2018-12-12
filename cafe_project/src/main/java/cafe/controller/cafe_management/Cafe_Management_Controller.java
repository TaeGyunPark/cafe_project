package cafe.controller.cafe_management;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class Cafe_Management_Controller {
	private static final Logger logger = LoggerFactory.getLogger(Cafe_Management_Controller.class);
	
	
	@RequestMapping(value="/cafe_info", method=RequestMethod.GET)
	public ModelAndView cafe_information() {
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("cafe_management/cafe_infomation");
		
		return mav;
	}
	
}
