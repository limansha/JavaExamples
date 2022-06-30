package com.circularLinkedList;

public class OwnCircluarLinkedList {
	class Node{
		int value;
		Node next;
		public Node(int value) {
			super();
			this.value = value;
		}
	}
	Node head;
	Node tail;
	int size;
	public int getSize() {
		return size;
	}
	public void insertAtStart(int value) {
		Node node = new Node(value);
		if(head == null) {
			head = node;
			node.next = head;
			tail = node;
			return;
		}
		node.next = head;
		head = node;
		tail.next = head;
		size++;
	}
	public void insertAtEnd(int value) {
		Node node = new Node(value);
		if(head == null) {
			head = node;
			node.next = head;
			tail = node;
			return;
		}
		tail.next = node;
		node.next = head;
		tail = node;
		size++;
	}
	public void insertAtPos(int value,int index) {
		Node node = new Node(value);
		if(index == 0) {
			insertAtStart(value);
			return;
		}
		if(index == size) {
			insertAtEnd(value);
			return;
		}
		Node prevnode = getNode(index-1);
		node.next = prevnode.next;
		prevnode.next = node;
		size++;
	}
	public Node getNode(int index) {
		//no need to check first and last node index check as they are covered in insertAtPos() 
		Node temp=head;
		for(int i =0;i<index;i++) {
			temp = temp.next;
		}
		return temp;
	}
	public int deleteAtFirst() {
		int val = head.value;
		head = head.next;
		tail.next = head;
		size--;
		return val;
	}
	public int deleteAtEnd() {
		int val = tail.value;
		Node temp = head;
		while(temp.next != tail) {
			temp= temp.next;
		}
		temp.next = tail.next;
		tail = temp;
		size--;
		return val;
	}
	public int deleteAtPos(int index) {
		Node temp = head;
		for(int i =0;i<index-1;i++) {
			temp= temp.next;
		}
		int val = temp.next.value;
		temp.next = temp.next.next;
		size--;
		return val;
	}
	public void display() {
		Node temp = head;
		if(head != null) {
			do {
				System.out.print(temp.value+" -> ");
				temp = temp.next;
			}while(temp != head);
		}
		System.out.print("end");
		System.out.println();
	}
}
