package com.qa.java;

import com.qa.java.basicclasses.Book;
import com.qa.java.basicclasses.Person;

public class Runner {

	public static void main(String[] args) {
		Person person = new Person("john", 43, "male");
		Book book = new Book();
		book.title = "Some title title";
		person.read(book);
	}

}
