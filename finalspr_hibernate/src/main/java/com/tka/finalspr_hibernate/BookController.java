package com.tka.finalspr_hibernate;

import java.util.ArrayList;
import java.util.List;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
	@Autowired
	BookService bs;
	
	@Value("${c1.n}")
	int a; //this is a primitive variable, i want to give a value to this variable from which file ? application.properties

	@GetMapping("/allBooks")
	public ArrayList<Book> getBooks() {

		ArrayList<Book> h = bs.getBooks();
		System.out.println(a);
		return h;

	}
	
	@GetMapping("/morethan")
	public ArrayList<Book> getBooksMoreThan(){
		return bs.getBooksMoreThan();
	}

	@GetMapping("/fetchSingleBook")
	public Book fetchSingleBook() {
		
		Book b = bs.fetchSingleBook();
		
		return b;
	}
	
	@PostMapping("/addSingleBook")
	public void addSingleBook(@RequestBody Book b) {
		
		bs.addSingleBook(b);
		
		
	}
	
	@PutMapping("/updateSingleBook")
	public void updateSingleBook(@RequestBody Book b) {
		bs.updateSingleBook(b);
	}
	
	
	
	@DeleteMapping("/deleteSingleBook")
	public void deleteSingleBook(@RequestParam int bid) {
		bs.deleteSinglePlayer(bid);
	}
	
	
	@GetMapping("/getBooksByName/{ebook}")
	public List<Book> getBooksByName(@PathVariable String ebook) {
		System.out.println(ebook);
		return bs.getBooksByName(ebook);
	}
	
	@GetMapping("/getBooksByNameByPrice")
	public List<Book> getBooksByNameByPrice(@RequestParam String ebook, @RequestParam int eprice){
		return bs.getBooksByNameByPrice(ebook, eprice);
	}
	
	
	
	//update delete fetch to be done using postman only
}