package d17cqcp02.n17dccn155.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
@RequestMapping("student-mgr")
public class StudentMngController {

	@RequestMapping()
	public String index(ModelMap model)
	{
		model.addAttribute("messages","gọi index()");
		return "student-mgr";
	}
	@RequestMapping(params="btnInsert")
	public String insert(ModelMap model)
	{
		model.addAttribute("messages","gọi insert()");
		return "student-mgr";
	}
	
	@RequestMapping(params="btnUpdate")
	public String update(ModelMap model)
	{
		model.addAttribute("messages","gọi update()");
		return "student-mgr";
	}
	@RequestMapping(params="btnDelete")
	public String delete(ModelMap model)
	{
		model.addAttribute("messages","gọi delete()");
		return "student-mgr";
	}
	@RequestMapping(params="btnReset")
	public String reset(ModelMap model)
	{
		model.addAttribute("messages","gọi Reset()");
		return "student-mgr";
	}
	@RequestMapping(params="lnkEdit")
	public String edit(ModelMap model)
	{
		model.addAttribute("messages","gọi lnkEdit()");
		return "student-mgr";
	}
}
