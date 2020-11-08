package t3h.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import t3h.springboot.entities.Library;

public interface LibraryRepository extends JpaRepository<Library, Integer>{

}
