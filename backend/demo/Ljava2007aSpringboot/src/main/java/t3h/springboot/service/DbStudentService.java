package t3h.springboot.service;

import java.util.List;

import t3h.springboot.entities.Student;

public interface DbStudentService {

	void insert(Student student);
	List<Student> getStudents();
	void update(Student student);
	void delete(Student student);
	
}
