package t3h.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import t3h.springboot.entities.Student;

public interface StudentRepository extends 
	JpaRepository<Student, Integer>{

}
