package springmvc.controller;

import org.springframework.stereotype.Controller;
/*import javax.servlet.http.HttpServletRequest;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;*/

@Controller

public class HomeController {

	/*@RequestMapping("/home")
	public ModelAndView home(HttpServletRequest req){
		String name =req.getParameter("productName");
		System.out.println(name);
		
		System.out.println("from home controller");
		ModelAndView mv = new ModelAndView();
		mv.addObject("name", "Babu");
		mv.setViewName("home");
		return mv;
	}
	@RequestMapping(path="/process", method= RequestMethod.POST)
	public String process(HttpServletRequest req){
		String name =req.getParameter("productName");
		System.out.println(name);
		
		System.out.println("from home controller");
		return "";
	}
	@RequestMapping("/about")
	public String about(Model m){
		System.out.println("from about controller");
		m.addAttribute("name", "Amit Dubey");
		return "about";
	}*/
}
