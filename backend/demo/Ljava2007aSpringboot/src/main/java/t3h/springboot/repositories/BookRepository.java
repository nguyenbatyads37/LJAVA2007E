package t3h.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import t3h.springboot.entities.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
