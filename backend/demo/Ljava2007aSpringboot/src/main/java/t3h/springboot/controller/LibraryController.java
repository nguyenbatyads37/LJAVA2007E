package t3h.springboot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import t3h.springboot.entities.Address;
import t3h.springboot.entities.Author;
import t3h.springboot.entities.Book;
import t3h.springboot.entities.Language;
import t3h.springboot.entities.Library;
import t3h.springboot.repositories.BookRepository;
import t3h.springboot.repositories.LibraryRepository;

@Controller
@RequestMapping(value = "/library")
public class LibraryController {
	
	@Autowired
	private LibraryRepository libRepo;

	@GetMapping(value = "/save")
	public String saveLibrary() {
		Address address = new Address();
		address.setLocation("So 10, Cau Giay");
		
		Library lib = new Library();
		lib.setName("Nha sach Nguyen Van Cu");
		lib.setAddress(address);
		
		libRepo.save(lib);
		
		return "success";
	}
	
	@GetMapping(value = "/get")
	public String getLibrary() {
		libRepo.findAll().forEach(e -> {
			System.out.println(e.toString());
		});
		return "success";
	}
	
	@Autowired
	private BookRepository bookRepo;
	
	@GetMapping(value = "/book/save")
	public String saveBook() {
		Author author = new Author();
		author.setName("Ngo Tat To");
		
		Book book = new Book();
		book.setAuthor(author);
		book.setName("Tat Den");
		
		Language lang1 = new Language();
		lang1.setName("English");
		
		Language lang2 = new Language();
		lang2.setName("Vietnamese");
		
		List<Language> listLang = new ArrayList<Language>();
		listLang.add(lang1);
		listLang.add(lang2);
		book.setLanguages(listLang);
		
		bookRepo.save(book);
		return "success";
	}
	
	@GetMapping(value = "/book/get")
	public String getBook() {
		bookRepo.findAll().forEach(e -> {
			System.out.println(e.toString());
		});
		return "success";
	}
}
