package d17cqcp02.n17dccn155.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import d17cqcp02.n17dccn155.models.Student;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping(method=RequestMethod.GET)
	public String formSV()
	{
		
		return "student/form";
	}
	@RequestMapping(method=RequestMethod.POST)
	public String saveSV(HttpServletRequest request)
	{
		String name = request.getParameter("name");
		String mark = request.getParameter("mark");
		String major = request.getParameter("major");
		
		request.setAttribute("name", name);
		request.setAttribute("mark", mark);
		request.setAttribute("major", major);
		return "/student/success";
	}
	@RequestMapping(value="form2",method=RequestMethod.GET)
	public String form2SV()
	{
		
		return "student/form2";
	}
	@RequestMapping(value="form2",params="btnInsert")
	public String insert(ModelMap model,@RequestParam("name") String name,@RequestParam("mark") Double mark,@RequestParam("major") String major)
	{
		model.addAttribute("name",name);
		model.addAttribute("major",major);
		model.addAttribute("mark",mark);
		return "/student/success";
	}
	@RequestMapping(value="form2",params="btnInsert2")
	public String insert2(ModelMap model,Student student)
	{
		model.addAttribute("student",student);
		
		return "/student/success2";
	}
}
