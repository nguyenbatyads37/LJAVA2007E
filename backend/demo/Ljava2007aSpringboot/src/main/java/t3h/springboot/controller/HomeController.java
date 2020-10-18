package t3h.springboot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import t3h.springboot.pojo.Student;

@Controller
public class HomeController {

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String getHome(Model model) {
		model.addAttribute("hello", "Hello world");
		model.addAttribute("listStudent", getListStudent());
		model.addAttribute("gender", "F");
		model.addAttribute("student", new Student("", ""));
		return "home";
	}
	
	private List<Student> getListStudent() {
		List<Student> result = new ArrayList<>();
		result.add(new Student("001", "Nguyen Van A"));
		result.add(new Student("002", "Nguyen Van B"));
		result.add(new Student("003", "Nguyen Van C"));
		return result;
	}
	
	@RequestMapping(value = "/submitStudent", 
			method = RequestMethod.POST)
	public String submitStudent(
			@ModelAttribute(name="student") Student student) {
		System.out.println("id: " + student.getId());
		System.out.println("name: " + student.getName());
		return "success";
	}
}
