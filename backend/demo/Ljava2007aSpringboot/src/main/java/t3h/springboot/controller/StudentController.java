package t3h.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import t3h.springboot.pojo.Student;
import t3h.springboot.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;

	@GetMapping("/student")
	public String getStudentPage(Model model) {
		model.addAttribute("listStudent", studentService.getStudents());
		return "student-management";
	}
	
	@GetMapping("/deleteStudent/{studentId}")
	public String deleteStudent(Model model, @PathVariable String studentId) {
		studentService.deleteStudent(studentId);
		model.addAttribute("msg", "Delete success!");
		model.addAttribute("listStudent", studentService.getStudents());
		return "student-management";
	}
	
	@PostMapping("/addStudent")
	public String addStudent(Model model, 
			@ModelAttribute(name = "student") Student student) {
		studentService.addStudent(student);
		model.addAttribute("msg", "Add success!");
		model.addAttribute("listStudent", studentService.getStudents());
		return "student-management";
	}
	
	@PostMapping("/editStudent")
	public String editStudent(Model model, 
			@ModelAttribute(name = "student") Student student) {
		studentService.editStudent(student);
		model.addAttribute("msg", "Edit success!");
		model.addAttribute("listStudent", studentService.getStudents());
		return "student-management";
	}
	
	@GetMapping("/getEdit/{studentId}")
	public String getEditStudent(Model model, 
			@PathVariable String studentId) {
		Student student = studentService.getStudentById(studentId);
		model.addAttribute("student", student);
		return "student-edit";
	}
}
