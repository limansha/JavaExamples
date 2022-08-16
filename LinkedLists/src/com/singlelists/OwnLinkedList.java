package com.singlelists;

public class OwnLinkedList {

	class Node{
		int value;
		Node next;
		public Node(int value, Node next) {
			super();
			this.value = value;
			this.next = next;
		}
		public Node(int value) {
			super();
			this.value = value;
		}
	}
	Node head;
	int size;
	
	public void insertAtFirst(int value) {
		Node node = new Node(value);
		node.next = head;
		head = node;
		size++;
	}
	public void insertAtEnd(int value) {
		Node node = new Node(value);
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = node;
		size++;
	}
	public void insertAtPos(int value,int index) {
		Node node = new Node(value);
		Node temp = head;
		for(int i =0;i<index-1;i++) temp = temp.next;
		node.next = temp.next;
		temp.next = node;
		size++;
	}
	
	public int deleteFirst() {
		int val = head.value;
		head = head.next;
		if(head == null) return -1;
		size--;
		return val;
	}
	public int deleteLast() {
	if(size <= 1)
		return deleteFirst();
	Node a = getElement(size-2);
	int val = a.next.value;
	a.next = null;
	size--;
	return val;
	}public int deleteAtPos(int index) {
		if(index == 0) return deleteFirst();
		if(index == size - 1) return deleteLast();
		Node prev = getElement(index-1);
		int val = prev.next.value;
		prev.next = prev.next.next;
		size--;
		return val;
	}
	//important is for delete operation always get the before node you are planning to delete
	public Node getElement(int index) {
		Node temp = head;
		for(int i=0;i<index;i++) temp = temp.next;
		return temp;
	}
	
	public void displayList() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.value + " -> ");
			temp = temp.next;
		}
		System.out.print("end");
		System.out.println();
	}
	public void reverseListIterative() {
		Node prev = null;
		Node curr = head;
		Node nxt;
		while(curr != null) {
			nxt = curr.next;
			curr.next = prev;
			prev = curr;
			curr = nxt;
		}
		head = prev;
		return;
	}
	
	public int getListSize() {
		return size;
	}
	
}
