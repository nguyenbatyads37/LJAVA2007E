package t3h.springboot.entities;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "book")
public class Book {

	@Id
	@Column(name = "book_id")
	@GeneratedValue
	private long id;
	
	@Column(name = "name")
	private String name;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "author_id")
	private Author author;
	
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "book_language",
			joinColumns = @JoinColumn(name = "language_id"),
			inverseJoinColumns = @JoinColumn(name = "book_id"))
	private List<Language> languages;

	public List<Language> getLanguages() {
		return languages;
	}

	public void setLanguages(List<Language> languages) {
		this.languages = languages;
	}

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

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name 
				+ ", author=" + author.getName() 
				+ ", language=" + languages.size() + "]";
	}
}
