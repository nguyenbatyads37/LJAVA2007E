package t3h.springboot.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "language")
public class Language {

	@Id
	@Column(name = "language_id")
	@GeneratedValue
	private long id;
	
	@Column(name = "name")
	private String name;
	
	@ManyToMany(mappedBy = "languages")
	private List<Book> books;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	@Override
	public String toString() {
		return "Language [id=" + id + ", name=" + name 
				+ ", books=" + books.size() + "]";
	}
	
	
	
}
