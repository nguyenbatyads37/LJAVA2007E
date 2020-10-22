package t3h.springboot.service;

import java.util.List;

import t3h.springboot.pojo.Student;

public interface StudentService {
	public Student getStudentById(String id);
	public void addStudent(Student student);
	public void editStudent(Student student);
	public void deleteStudent(String id);
	public List<Student> getStudents();
}
