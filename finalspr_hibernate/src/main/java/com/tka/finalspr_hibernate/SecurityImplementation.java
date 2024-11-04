package com.tka.finalspr_hibernate;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SecurityImplementation {
	
	@Before("execution(* com.tka.finalspr_hibernate.BookService.getBooks())")
	public void security() {
		System.out.println("Security Implementation");
	}
	

}
