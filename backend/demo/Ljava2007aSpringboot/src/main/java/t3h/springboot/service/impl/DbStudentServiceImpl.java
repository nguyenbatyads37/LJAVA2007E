package t3h.springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import t3h.springboot.entities.Student;
import t3h.springboot.repositories.HandmadeStudentRepository;
import t3h.springboot.repositories.StudentRepository;
import t3h.springboot.service.DbStudentService;

@Service
public class DbStudentServiceImpl 
	implements DbStudentService{
	
	@Autowired
	private StudentRepository studentRepo;
	
	@Autowired
	private HandmadeStudentRepository handmadeStRepo;

	@Override
	public void insert(Student student) {
		handmadeStRepo.saveStudent(student);
	}

	@Override
	public List<Student> getStudents() {
		return studentRepo.findAll();
	}

	@Override
	public void update(Student student) {
		studentRepo.save(student);
		
	}

	@Override
	public void delete(Student student) {
		studentRepo.delete(student);
	}
	
}
