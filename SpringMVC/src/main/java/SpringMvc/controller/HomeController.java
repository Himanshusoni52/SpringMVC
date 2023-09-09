package SpringMvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String Home(Model model)
	{
		model.addAttribute("name","Himanshu");
		
		return "index";
	}
	@RequestMapping("/about")
	public String About()
	{
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help()
	{
		//create Model And View object
		ModelAndView modelAndView = new ModelAndView();
		
		//setting the Data
		modelAndView.addObject("name","Himanshu");
		
		//setting the view
		modelAndView.setViewName("help");
		
		return modelAndView;
	}

}
