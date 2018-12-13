package cafe.controller.owner.orderingdepartment;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import cafe.dto.Cafe_ordering_department;
import cafe.service.face.owner.orderingdepartment.OwnerOrderingDepartmentService;

@Controller
public class OwnerOrderingDepartmentController {

	private static final Logger logger = LoggerFactory.getLogger(OwnerOrderingDepartmentController.class);
	@Autowired OwnerOrderingDepartmentService ooDeptService;
	
	@RequestMapping(value="/owner/setsessiontest")
	private void session(HttpSession session) {
		// test 용 session
		session.setAttribute("owner_no", 200);
		session.setAttribute("cafe_no", 200);
	}
	
	@RequestMapping(value="/owner/stock/manage/orderingdepartment/list", method=RequestMethod.GET)
	public void orderingDepartmentList(
			HttpSession session,
			Cafe_ordering_department coDept,
			Model model
		) {
		logger.info("This is controller of od test!");
		
//		logger.info((String) session.getAttribute("cafe_no"));
//		String cafe_no_String = (String) session.getAttribute("cafe_no");
//		int cafe_no_int = Integer.parseInt(cafe_no_String);
//		logger.info("cafe_no : "+cafe_no_int);
//		coDept.setCafe_no(cafe_no_int);
		
		coDept.setCafe_no(200);
		
		List<Cafe_ordering_department> oDeptList = ooDeptService.getOrderingDepartmentList(coDept);
		
		model.addAttribute("oDeptList", oDeptList);
		
//		logger.info(oDeptList.toString());
	}
	
	@RequestMapping(value="/owner/stock/manage/orderingdepartment/remarks", method=RequestMethod.GET)
	public void viewOrderingDepartmentRemarks(
			@RequestParam int ordering_department_no,
			Cafe_ordering_department coDept,
			Model model
		) {
		logger.info("This is controller of remarks view!");
		
		coDept.setOrdering_department_no(ordering_department_no);
		coDept = ooDeptService.getOneOrderingDepartment(coDept);
		
		model.addAttribute("coDept", coDept);
	}
	
	@RequestMapping(value="/owner/stock/manage/orderingdepartment/update", method=RequestMethod.GET)
	public void updateOrderingDepartment(
			@RequestParam int ordering_department_no,
			Cafe_ordering_department coDept,
			Model model	
		) {
		
		coDept.setOrdering_department_no(ordering_department_no);
		coDept = ooDeptService.getOneOrderingDepartment(coDept);
		model.addAttribute("coDept", coDept);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}