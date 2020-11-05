package t3h.springboot.repositories;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import t3h.springboot.entities.Student;

@Repository
@Transactional
public class HandmadeStudentRepositoryImpl implements
	HandmadeStudentRepository{
	
	@Autowired
	EntityManager entityManager;

	@Override
	public void saveStudent(Student student) {
		String queryStr = "INSERT INTO student "
				+ "VALUES"
				+ "(?1, ?2, ?3, ?4)";
		Query query = entityManager
				.createNativeQuery(queryStr);
		query.setParameter(1, student.getStudentId());
		query.setParameter(2, student.getName());
		query.setParameter(3, student.getAge());
		query.setParameter(4, student.getSubject());
		
		query.executeUpdate();
	}

	@Override
	public List<Student> getStudents() {
		String queryStr = "SELECT * FROM student";
		return entityManager.createNativeQuery(queryStr)
				.getResultList();
	}

	@Override
	public Student getStudentById(Student student) {
		String queryStr = "SELECT * FROM student"
				+ " WHERE "
				+ "student_id = ?1";
		Query query = entityManager
				.createNativeQuery(queryStr, Student.class);
		query.setParameter(1, student.getStudentId());
		return (Student) query.getSingleResult();
	}
	
	public int getCustomerNumber() {
		String queryStr = "SELECT getCustomer(3)";
		Query query = entityManager
				.createNativeQuery(queryStr);
		return (Integer) query.getSingleResult();
	}

}
