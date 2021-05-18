package com.qa.java;

import basicclasses.Book;
import basicclasses.Person;

public class Runner {

	public static void main(String[] args) {
		Person person = new Person("john", 43, "male");
		Book book = new Book();
		book.title = "Some title title";
		person.read(book);
	}

}
