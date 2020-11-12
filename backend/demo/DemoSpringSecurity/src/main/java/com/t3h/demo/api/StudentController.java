package com.t3h.demo.api;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.t3h.demo.pojo.Student;

@RestController
@RequestMapping(value = "/api/student")
public class StudentController {
	
	private List<Student> listStudent = Arrays.asList(
				new Student(1, "Nguyen Van A"),
				new Student(2, "Nguyen Van B")
			);

	@GetMapping(value = "/get")
	public List<Student> getStudent() {
		return listStudent;
	}
}
