package com.tka.finalspr_hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class BookDao {
	@Autowired
	SessionFactory f;

	public ArrayList<Book> getBooks() {

		Session sess = f.openSession();
		Criteria c = sess.createCriteria(Book.class);
		//all the book details
		ArrayList<Book> l = (ArrayList<Book>) c.list();
		System.out.println(l);
		return l;

	}
	
	

	public Book fetchSingleBook() {
		// TODO Auto-generated method stub
		
		Session sess = f.openSession();
		
		Book b = sess.load(Book.class, 1);
		
		return b;
	}

	public void addSingleBook(Book b) {
			
		Session sess = f.openSession();
		Transaction trans = sess.beginTransaction();
		sess.save(b);
		trans.commit();
		sess.close();

		
	}

	public void updateSingleBook(Book b) {
		// TODO Auto-generated method stub
		
		Session sess = f.openSession();
		Transaction trans = sess.beginTransaction();
		sess.update(b);
		trans.commit();
		sess.close();
		
	}

	public void deleteSinglePlayer(int bid) {
		// TODO Auto-generated method stub
		Session sess = f.openSession();
		Transaction trans = sess.beginTransaction();
		Book b = sess.load(Book.class, bid);
		sess.delete(b);
		trans.commit();
		
		
	}



	
	
//	public String insertBookData() {
//		
//		Session session = sf.openSession();
//		
//		Transaction trans = 
//	}

}


