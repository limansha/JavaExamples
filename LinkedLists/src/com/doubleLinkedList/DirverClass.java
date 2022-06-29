package com.doubleLinkedList;

public class DirverClass {

	public static void main(String[] args) {
		OwnDoubleLinkedList odll = new OwnDoubleLinkedList();
		
		odll.insertAtFirst(3);
		odll.insertAtFirst(4);
		odll.insertAtFirst(5);
		odll.insertAtFirst(2);
		odll.insertAtEnd(10);
		odll.insertAtEnd(11);
		System.out.println(odll.getSize());
		odll.insertAtPos(15,5);
		odll.displayLR();
		//System.out.println(odll.deleteAtFirst());
		//System.out.println(odll.deleteAtEnd());
		System.out.println(odll.deleteAtPos(1));
		odll.displayLR();
		//odll.displayRL();
	}

}
