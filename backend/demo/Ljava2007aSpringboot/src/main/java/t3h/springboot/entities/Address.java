package t3h.springboot.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "address")
public class Address {

	@Id
	@Column(name = "address_id")
	@GeneratedValue
	private int id;
	
	@Column(name = "location")
	private String location;
	
	@OneToOne(mappedBy = "address")
	private Library library;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Library getLibrary() {
		return library;
	}

	public void setLibrary(Library library) {
		this.library = library;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", location=" + location 
					+ ", library=" + library.getName() + "]";
	}
}
