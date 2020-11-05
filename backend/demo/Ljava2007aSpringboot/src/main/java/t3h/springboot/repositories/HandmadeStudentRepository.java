package t3h.springboot.repositories;

import java.util.List;

import t3h.springboot.entities.Student;

public interface HandmadeStudentRepository {

	void saveStudent(Student student);
	List<Student> getStudents();
	Student getStudentById(Student student);
}
