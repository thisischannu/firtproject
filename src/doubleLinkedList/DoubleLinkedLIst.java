package doubleLinkedList;

import java.util.Scanner;

public class DoubleLinkedLIst {

	Scanner sc=new Scanner(System.in);
	Node head;
	
	
	class Node{
		int data;
		Node left;
		Node right;
	}
	
	
	public void appendBegin() {
		
		Node node=new Node();
		System.out.println("enter data to append front");
		node.data=sc.nextInt();
		node.left=null;
		node.right=null;
		
		
		if (head==null) {
			head=node;
		}
		else {
			head.left=node;
			node.right=head;
			head=node;
		}
	}
	
	public int length() {
		int count=0;
		Node temp=head;
		
		while(temp!=null)
		{
			temp=temp.right;
			count++;
		}
		return count;
	}
	
	public void insertAt(int index) {
		Node node=new Node();
		System.out.println("enter data to insert at index");
		node.data=sc.nextInt();
		node.left=null;
		node.right=null;
		int len=length();
		Node temp=head;
		int i=1;
		if (index>len) {
			System.out.println("insert cannot possible:");
			
		}
		else {
			while (i<index) {
				temp=temp.right;
				i++;
			}
			node.right=temp.right;
			temp.right.left=node;	
			temp.right=node;
			node.left=temp;
		}
		
	}
	
	
	public void append() {
		Node node=new Node();
		System.out.println("enter data to insert");
		node.data=sc.nextInt();
		node.left=null;
		node.right=null;
		
		if (head==null) {
			head=node;
		}
		else {
			
			Node temp=head;
			while (temp.right!=null) {
				temp=temp.right;
			}
			temp.right=node;
			node.left=temp;
		}
	}
	
	private void display() {

		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.right;
		}
	}
	
	
	
	public static void main(String[] args) {
		int input;
		DoubleLinkedLIst dll=new DoubleLinkedLIst();
		while(true) {
			System.out.println("enter choices");
			System.out.println("press 1 to append");
			System.out.println("press 2 to display");
			System.out.println("press 3 to add begining");
			System.out.println("press 4 to find length");
			System.out.println("press 5 to add at index");
			input=dll.sc.nextInt();
			
			switch (input) {
			case 1:dll.append();
				
				break;
			case 2:dll.display();
			break;
			
			case 3:dll.appendBegin();
				break;
				
			case 4:int len=dll.length();
				System.out.println("length is ::"+len);
				break;
			case 5:System.out.println("enter index");
			int ind=dll.sc.nextInt();
				dll.insertAt(ind);
			break;
			default:
				break;
			}
			
			
		}
		
		
		
		
		
	}
}
