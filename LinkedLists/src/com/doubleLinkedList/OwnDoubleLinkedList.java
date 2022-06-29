package com.doubleLinkedList;

public class OwnDoubleLinkedList {

	class Node{
		int value;
		Node next;
		Node prev;
		public Node(int value, Node next, Node prev) {
			super();
			this.value = value;
			this.next = next;
			this.prev = prev;
		}
		public Node(int value) {
			super();
			this.value = value;
		}
	}
	Node head;
	int size =1;
	public int getSize() {
		return size;
	}
	public void insertAtFirst(int value) {
		Node node = new Node(value);
		if(head == null) 
			{
			head = node;
			return;
			}
		node.prev = null;
		node.next = head;
		head.prev = node; 
		head = node;
		size++;
	}
	public void insertAtEnd(int value) {
		Node node = new Node(value);
		if(head == null) 
			{
			head = node;
			return;
			}
		Node temp  = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		node.next = null;
		node.prev = temp;
		temp.next = node; 
		size++;
	}
	public void insertAtPos(int value,int index) {
		Node node = new Node(value);
		if(index == 0) {
			insertAtFirst(value);
			return;
		}
		if(index == size) {
			insertAtEnd(value);
			return;
		}
		Node temp = head;
		for(int i =0;i<index-1;i++) {
			temp = temp.next;
		}
		node.next = temp.next;
		node.prev = temp;
		temp.next = node;
		size++;
	}
	
	public Node getNode(int index) {
		Node temp = head;
		for(int i =0; i<index;i++) {
			temp = temp.next;
		}
		return temp;
	}
	public int deleteAtFirst() {
		Node org = getNode(0);
		Node nxt = getNode(1);
		int val = org.value;
		nxt.prev = null;
		org.next = null;
		head = nxt;
		size--;
		return val;
	}
	public int deleteAtEnd() {
		Node org = getNode(size - 1);
		Node pre = getNode(size - 2);
		int val = org.value;
		pre.next = null;
		org.prev = null;
		size--;
		return val;
	}
	public int deleteAtPos(int pos) {
		Node org = getNode(pos);
		Node pre = getNode(pos - 1);
		int val = org.value;
		pre.next = org.next;
		org.next.prev = pre;
		org.prev = null;
		org.next = null;
		size--;
		return val;
	}
	public void displayLR() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.value +" -> ");
			temp = temp.next;
		}
		System.out.print("end");
		System.out.println();
	}
	public void displayRL() {
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		while(temp!= null) {
			System.out.print(temp.value+" -> ");
			temp = temp.prev;
		}
		System.out.print("end");
		System.out.println();
	}
}
