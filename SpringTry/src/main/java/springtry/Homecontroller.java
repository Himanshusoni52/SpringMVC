package springtry;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Homecontroller {
	
	@RequestMapping("/home")
	public String home()
	{
		System.out.println("uri working");
		return "index";
	}

}
