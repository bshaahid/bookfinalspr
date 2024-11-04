package com.tka.finalspr_hibernate;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
@Service
public class BookService {
	@Autowired
	BookDao bd;
	public Object getBooksByCost;
	public ArrayList<Book>getBooks()
	{
		
		ArrayList<Book> h=bd.getBooks();
		return h;
		
	}
	public ArrayList<Book> getBooksMoreThan() {
		// TODO Auto-generated method stub
		ArrayList<Book> booksMoreThan = new ArrayList<>();
		ArrayList<Book> allBooks = bd.getBooks();
		
		for(Book b: allBooks) {
			if (b.bkcost > 180) {   		//do this with the get method. it would throw an error if it was private
				booksMoreThan.add(b);
			}
		}
		return booksMoreThan;
		
	}
	
	public Book fetchSingleBook() {
		
		Book b = bd.fetchSingleBook();
				
		return b;
	}
	public void addSingleBook(Book b) {
		// TODO Auto-generated method stub
		bd.addSingleBook(b);
	}
	
	public void updateSingleBook(Book b) {
		// TODO Auto-generated method stub
		bd.updateSingleBook(b);
		
	}
	public void deleteSinglePlayer(int bid) {
		// TODO Auto-generated method stub
		bd.deleteSinglePlayer(bid);
		
		
	}
	public List<Book> getBooksByName(String ebook) {
		// TODO Auto-generated method stub
		List<Book> eBook = bd.getBooks();
		
		List<Book> eBook1 = new ArrayList<Book>();
		
		
		for(Book b: eBook) {
			if (b.getBknm().equalsIgnoreCase(ebook)) {
				eBook1.add(b);
			}
			
		}
	    return eBook1;
	}
	
	public List<Book> getBooksByNameByPrice(String ebook, int eprice) {
		// TODO Auto-generated method stub
		
		List<Book> eBook = bd.getBooks();
		
		List<Book> eBook1 = new ArrayList<Book>();
		
		
		for(Book b: eBook) {
			if (b.getBknm().equalsIgnoreCase(ebook) && b.getBkcost() >= eprice) {
				eBook1.add(b);
			}
			
		}
	    return eBook1;
	}
	
	
	
	
	
	
	
}