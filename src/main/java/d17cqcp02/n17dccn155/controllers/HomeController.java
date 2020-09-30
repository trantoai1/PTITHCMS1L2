package d17cqcp02.n17dccn155.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	
	@RequestMapping("/")
	public String viewHome()
	{
		return "redirect:welcome";
	}
}
