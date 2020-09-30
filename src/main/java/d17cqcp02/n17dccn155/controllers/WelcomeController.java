package d17cqcp02.n17dccn155.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class WelcomeController {
	@RequestMapping("welcome")
	public String viewWelcome()
	{
		return "welcome";
	}
	@RequestMapping(value="welcome",method=RequestMethod.POST,params="bai1")
	public String viewBai1()
	{
		return "redirect:student";
	}
	@RequestMapping(value="welcome",method=RequestMethod.POST,params="bai2")
	public String viewBai2()
	{
		return "redirect:student-mgr";
	}
	@RequestMapping(value="welcome",method=RequestMethod.POST,params="bai4")
	public String viewBai4()
	{
		return "redirect:student/form2";
	}
}
