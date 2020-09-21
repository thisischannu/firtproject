package siglyLInkedList;

import java.util.Scanner;

public class LinkedList {

	Node head;
	static Scanner sc = new Scanner(System.in);

	class Node {
		int data;
		Node next;
	}

	public void insertAt() {
		Node node = new Node();
		System.out.println("enter index no..");
		int index = sc.nextInt();
		System.out.println("enter data to insert..");
		node.data = sc.nextInt();

		if (index > length()) {
			System.out.println("deletion not possible...");
			System.out.println("length of linked list is ::" + length());
		}

		else if (index == 0 && head == null) {
			head = node;
		} else if (index == 0 && head != null) {
			node.next = head;
			head = node;
		} else {
			Node temp = head;
			for (int i = 0; i < index - 1; i++) {
				temp = temp.next;
			}
			node.next = temp.next;
			temp.next = node;
		}
	}

	public void append() {
		Node node = new Node();
		System.out.println("enter data");
		node.data = sc.nextInt();
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

	public void insertFront() {

		Node node = new Node();
		System.out.println("enter Data to insert..");
		node.data = sc.nextInt();
		if (head == null) {
			head = node;
			// node.next=null;
		} else {
			node.next = head;
			head = node;
		}
	}

	public void delete() {
		System.out.println("enter idnex to delete...");
		Node temp = head, prev = null;
		;
		int index = sc.nextInt();
		if (index > length() || head == null) {
			System.out.println("deletion is not possible");
			System.out.println("current length of ll is::" + length());
		}

		else if (index == 0) {
			head = head.next;
		} else {
			for (int i = 0; i < index - 1; i++) {
				temp = temp.next;
			}
			prev = temp.next;
			temp.next = prev.next;
			prev.next = null;
		}
	}

	public void reverse() {
		int i, j, k, len;
		// Node p=head;
		Node q = head, p = head;
		len = length();
		i = 0;
		j = len - 1;
		while (i < j) {
			k = 0;
			while (k < j) {
				q = q.next;
				k++;
			}
			int temp = p.data;
			p.data = q.data;
			q.data = temp;
			i++;
			j--;
			p = p.next;
			q = head;

		}
	}

	public int length() {
		Node temp = head;
		int count = 0;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}

	public void disply() {
		Node temp = head;
		while (temp != null) {
			System.out.println("data is::" + temp.data);
			temp = temp.next;
		}
	}

	public static void main(String[] args) {

		int input;
		LinkedList ll = new LinkedList();
		while (true) {
			System.out.println("Press 1 append");
			System.out.println("Press 2 to insertFront");
			System.out.println("press 3 to insert at the index");
			System.out.println("Press 4 display");
			System.out.println("Press 5 find length");
			System.out.println("Press 6 to delete");
			System.out.println("Press 7 to reverse");

			System.out.println("enter your choice..");
			input = sc.nextInt();

			switch (input) {
			case 1:
				ll.append();

				break;
			case 2:
				ll.insertFront();

				break;
			case 3:
				ll.insertAt();

				break;
			case 4:
				ll.disply();

				break;

			case 5:
				int length = ll.length();
				System.out.println("length of linked list is ::" + length);
				break;

			case 6:
				ll.delete();
				break;

			case 7:
				ll.reverse();

			default:
				System.out.println("invalid data entered");
				break;
			}
		}
	}
}
