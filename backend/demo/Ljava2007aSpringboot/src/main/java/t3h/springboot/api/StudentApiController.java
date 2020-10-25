package t3h.springboot.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import t3h.springboot.pojo.Student;
import t3h.springboot.service.StudentService;

@RestController
public class StudentApiController {
	
	@Autowired
	private StudentService studentService;

	@RequestMapping(value = "/getStudentById"
			, method = RequestMethod.POST)
	public ResponseEntity<Student> getStudentById(
			@RequestBody Student student) {
		Student result = studentService.getStudentById(student.getId());
		return ResponseEntity.ok(result);
	}
}
