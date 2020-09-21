package stackUsingLinkedList;

import java.util.Scanner;

public class Stack {
	static Scanner sc=new Scanner(System.in);
	Node head;
	
	class Node{
		int data;
		Node next;
		
	}
	
	public void push() {
		Node node=new Node();
		System.out.println("enter data to push..");
		node.data=sc.nextInt();
		
		node.next=head;
		head=node;	
	}
	
	void pop() {
		Node temp=head;
		if (head==null) {
			System.out.println("stack is empty..");
		}
		else {
			head=temp.next;
			temp.next=null;
		}
	}
	void disply() {
				
		Node temp=head;
		if(head==null)
		{
			System.out.println("statck is empty");
		}
		else {
			while (temp!=null) {
				System.out.println(temp.data);
				temp=temp.next;
			}
		}
	}

	public static void main(String[] args) {
		Stack stack=new Stack();
		int input;
		
		while (true) {
			System.out.println("Press 1 append");
			System.out.println("Press 2 to insertFront");
			System.out.println("press 3 to insert at the index");
			System.out.println("Press 4 display");
			System.out.println("Press 5 find length");
			System.out.println("Press 6 to delete");

			System.out.println("enter your choice..");
			input = sc.nextInt();

			switch (input) {
			case 1:
				stack.push();

				break;
			case 2:
				stack.pop();

				break;
			
			case 4:
				stack.disply();

				break;
			
			default:
				System.out.println("invalid data entered");
				break;
				
			}
		}

	}

}
