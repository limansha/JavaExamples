package com.circularLinkedList;

public class DriverClass {

	public static void main(String[] args) {
		OwnCircluarLinkedList ocll = new OwnCircluarLinkedList();
		ocll.insertAtStart(3);
		ocll.insertAtStart(1);
		ocll.insertAtStart(6);
		ocll.insertAtEnd(15);
		ocll.insertAtEnd(18);
		ocll.display();
		ocll.insertAtPos(12, 3);
		ocll.insertAtPos(2, 1);
		ocll.display();
		ocll.deleteAtFirst();
		System.out.println(ocll.getSize());
		ocll.display();
		ocll.deleteAtEnd();
		System.out.println(ocll.getSize());
		ocll.display();
		ocll.deleteAtPos(1);
		System.out.println(ocll.getSize());
		ocll.display();
	}

}
