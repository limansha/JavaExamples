package com.creational.protype;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable{
	String name;
	List<Book> books = new ArrayList<>();
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
	public void loadData() {
		for(int i =0;i<10;i++) {
			Book b = new Book();
			b.setBid(i);
			b.setBookname("Book "+i);
			getBooks().add(b);
		}//a large amount of data that is coming from db via rest endpoint assume
	}
	@Override
	public String toString() {
		return "BookShop [name=" + name + ", books=" + books + "]";
	}
	//default shallow clone
//	@Override
//	protected Object clone() throws CloneNotSupportedException {
//		
//		return super.clone();
//	}
	@Override
	protected BookShop clone() throws CloneNotSupportedException {
		BookShop shop = new BookShop();
		for(Book b: this.getBooks()) { //fetching the data from old object bs in main 
			shop.getBooks().add(b);
		}
		return shop;
	}
	
}
