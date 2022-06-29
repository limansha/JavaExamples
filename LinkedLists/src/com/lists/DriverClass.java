package com.lists;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OwnLinkedList oll = new OwnLinkedList();
		oll.insertAtFirst(5);
		oll.insertAtFirst(4);
		oll.insertAtFirst(3);
		oll.insertAtFirst(2);
		oll.insertAtFirst(1);
		oll.insertAtEnd(10);
		oll.insertAtPos(7,5);
		oll.insertAtPos(8,6);
		oll.insertAtPos(6,5);
		System.out.println("size of list "+ oll.getListSize());
		oll.displayList();
		System.out.println("deleted element at first "+oll.deleteFirst());
		System.out.println("size of list "+ oll.getListSize());
		oll.displayList();
		System.out.println("deleted element at Last "+oll.deleteLast());
		System.out.println("size of list "+ oll.getListSize());
		oll.displayList();
		System.out.println("deleted element at pos 4 : "+oll.deleteAtPos(4));
		System.out.println("size of list "+ oll.getListSize());
		oll.displayList();
	}
}
