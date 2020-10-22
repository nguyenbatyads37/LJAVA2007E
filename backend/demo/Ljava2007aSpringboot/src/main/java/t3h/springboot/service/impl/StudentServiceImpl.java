package t3h.springboot.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import t3h.springboot.pojo.Student;
import t3h.springboot.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	private List<Student> listStudent = new ArrayList<Student>();
	
	public StudentServiceImpl() {
		listStudent.add(new Student("1010", "Nguyen Van A"));
	}

	@Override
	public void addStudent(Student student) {
		listStudent.add(student);
	}

	@Override
	public void editStudent(Student student) {
		for (Student st : listStudent) {
			if (st.getId().equals(student.getId())) {
				st.setName(student.getName());
			}
		}
	}

	@Override
	public void deleteStudent(String id) {
		for (int i = 0 ; i < listStudent.size(); i++) {
			if (listStudent.get(i).getId().equals(id)) {
				listStudent.remove(i);
			}
		}
	}

	@Override
	public List<Student> getStudents() {
		return listStudent;
	}

	@Override
	public Student getStudentById(String id) {
		Student student = null;
		for(Student st : listStudent) {
			if (id.equals(st.getId())) {
				student = st;
				break;
			}
		}
		return student;
	}

}
