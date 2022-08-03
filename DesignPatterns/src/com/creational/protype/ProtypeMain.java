package com.creational.protype;
//factory method is also an effective way to create an object but
//if object is large which takes lots of memory and time i.s the data from database object then we go for protype design pattern for creating object
//if you are creating an object with some initial values which are coming from a database means the object has many parameters
//the second object can be created via the first object which is initially created via a database i.e you can clone the first object as a second object
public class ProtypeMain {
	public static void main(String[] args) throws CloneNotSupportedException{
		
		//open a bookshop and the details of the books will come from the warehouse
		BookShop bs = new BookShop();
		bs.setName("Limansha store");
		//always calling the same data from the database for different instances of object will consume time to call db connectn and fetch data 
		//this is where we use Prototype
		bs.loadData();
		/*
		 * so the cloning should be a deep clone change the overriden clone method in BookStore for this
		 * */
		BookShop bs3 =  bs.clone();
		bs3.setName("Deep clone store");
		System.out.println(bs3.toString());
		
		bs.getBooks().remove(3);
		System.out.println(bs.toString());
		
		//now if we need the same data we do 
		BookShop bs1 = new BookShop(); 
		bs1.setName("new object store");
		bs1.loadData(); //this takes time and resources which is costly so rather we try to implement protype by cloning it 
		System.out.println(bs1.toString()); 
/*
 * 1: as clone in object method is protected and is not accessible for BookStore we implment Clonable marker interface and override clone method
 *  
 * */	
		BookShop bs2 = (BookShop) bs.clone(); //object not visiable so implement clonable
		bs2.setName("shallow clone Store");
		System.out.println(bs2.toString()); //normal cloning will creates a shallow copy of the object i.e both the objects bs and bs2  refers to same memory and instance as in line 26,so removal of a boo is also reflected on bs2	
	
	}
}
