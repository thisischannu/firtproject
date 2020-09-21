package queue;

import java.util.Scanner;




public class QueueLink {
	static Scanner sc=new Scanner(System.in);
	Node head;
	Node front;
	Node rear;
	
	class Node{
		int data;
		Node next;
		
	}

	public  void insert() {
		
		Node node=new Node();
		System.out.println("enter data to push..");
		node.data=sc.nextInt();
		node.next=null;
		if (front==null && rear==null) {
			front=rear=node;
		}
		else {
			rear.next=node;
			rear=node;
		}
		
		
	}
public  void display() {
	
	if (front==null && rear==null){
		System.out.println("queue is empty");
	}
	else {
		Node temp=front;
		while (temp!=null) {
System.out.println("data is:"+temp.data);
temp=temp.next;
		}
	}

	}
public  void delete() {
	Node temp=front;
	if(front==null && rear==null) {
		System.out.println("q is empty");
	}
	else {
		System.out.println("deleted item is :"+front.data);
		front=front.next;
		
	}
}
	
	
	
	public static void main(String[] args) {
		QueueLink queue=new QueueLink();
		int ip;
		
		while (true) {
			System.out.println("Press 1 append");
			System.out.println("Press 2 disply ");
			System.out.println("Press 3 delete");
		ip=sc.nextInt();	
			switch (ip) {
			case 1:queue.insert();
				
				break;
				
			case 2:queue.display();
					
				break;
			case 3:queue.delete();
			
			break;

			default:
				break;
		}

	}

}

}
