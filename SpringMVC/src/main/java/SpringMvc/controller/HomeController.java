package SpringMvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String Home()
	{
		return "index";
	}
	@RequestMapping("/about")
	public String About()
	{
		return "about";
	}

}
