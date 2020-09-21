package practice;

public class LinkedList {

	Node head;

	class Node {
		int data;
		Node next;
	}

	public void insert(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;

		if (head == null) {
			head = node;
		} else {
			Node temp = head;

			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
		}
	}

	public void insertFront(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;

		node.next = head;
		head = node;

	}

	public void show() {
		Node temp = head;
		while (temp != null) {

			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	public void insertAt(int index, int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;

		if (index == 0) {
			insertFront(data);
		} else {
			Node temp = head;
			for (int i = 0; i < index - 1; i++) {
				temp = temp.next;
			}
			node.next = temp.next;
			temp.next = node;
		}
	}

	public void delete(int key) {
		Node temp = head, prev = null;
		if (temp != null && temp.data == key) {
			head = temp.next;
		} else {
			while (temp != null && temp.data != key) {
				prev = temp;
				temp = temp.next;
			}

			if (temp == null)
				return;
			prev.next = temp.next;
		}
	}

	public void deletingAt(int index) {
		Node temp = head, prev = null;
		if ( temp!=null && index==0 ) {
			head = temp.next;
		}
		
		else {
			for (int i = 0; i <index; i++) {
				prev=temp;
				temp=temp.next;
			}
			
			prev.next=temp.next;
			
		}

	}

	public static void main(String[] args) {

		LinkedList ll = new LinkedList();

		ll.insert(25);
		ll.insert(23);
		ll.insert(255);
		ll.insert(245);
		ll.insert(224);
		ll.insertAt(3, 35);
		ll.show();
		ll.deletingAt(1);
		System.out.println("========");
		ll.show();
	}

}
