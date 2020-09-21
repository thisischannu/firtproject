package queue;

import java.util.Scanner;

public class Queue {
	static Scanner sc=new Scanner(System.in);
	 static int front;
	 static int rear;

	public static void main(String[] args) {
		
		int n=sc.nextInt();
		System.out.println("enter size;");
		
	int []ar=new int[n];
	
int ip;
	
		while (true) {
			System.out.println("Press 1 append");
			System.out.println("Press 2 disply ");
			System.out.println("Press 3 delete");
		ip=sc.nextInt();	
			switch (ip) {
			case 1:insert(ar);
				
				break;
				
			case 2:display(ar);
					
				break;
			case 3:delete(ar);
			
			break;

			default:
				break;
			}
		}
	}

	private static void delete(int[] ar) {
		if(front==rear) {
			System.out.println("queue is empty");
		}	
		else {
			System.out.println("deleted no is::"+ar[front]);
			for (int i = 0; i <rear-1; i++) {
				ar[i]=ar[i+1];
			}
			rear--;
		}
	}

	public static void display(int []ar) {
		
		System.out.println("fr"+front+" "+"rear"+rear);
		if(front==rear) {
			System.out.println("empty queue");
		}
		else {
			for(int i=0;i<rear;i++) {
				System.out.println("data:"+ar[i]);
			}
		}
		
		
			
	}

	public static void insert(int[] ar) {
		if(ar.length==rear) {
			System.out.println("queue is full..");
		}
		else {
			System.out.println("enter ele to insert..");
			int ele=sc.nextInt();
			ar[rear]=ele;
			rear++;
		}
		
		
	}

}
