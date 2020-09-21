package stack;

import java.util.Scanner;

public class Stack {

	public static int[] arr = new int[5];
	public static int top = -1;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int input;

		while (true) {
			System.out.println("enter 1 to push");
			System.out.println("enter 2 to pop");
			System.out.println("enter 3 to peek");
			System.out.println("enter 5 to traverse");
			System.out.println("enter 0 to exit");

			System.out.println("enter your choice..");
			input = sc.nextInt();
			switch (input) {
			case 1:
				System.out.println("enter element to push");
				int ele = sc.nextInt();
				push(ele);
				break;
			case 2:
				System.out.println("enter element to POP");
				int popnum = pop();
				if (popnum == 0) {
					System.out.println("stack is underflow.");
				} else {
					System.out.println("poped no is ::" + popnum);
				}

				break;
			case 3:
				display();
				break;

			case 4:
				peek();
				break;

			case 0:
				return;

			default:
				System.out.println("invalid in provided..");
				break;
			}

		}
	}

	public static void peek() {
		if (isEmpty()) {
			System.out.println("stack is empty");
		} else {
			System.out.println("peeked element is :" + arr[top]);
		}

	}

	public static void push(int ele) {
		if (isFull()) {
			System.out.println("push not possible stack is full");
		} else {
			top++;
			arr[top] = ele;
		}
	}

	public static int pop() {

		if (isEmpty()) {
			return 0;
		} else {
			return arr[top--];
		}

	}

	public static boolean isFull() {

		if (arr.length == top) {
			return true;
		} else {
			return false;
		}
	}

	public static void display() {
		if (isEmpty()) {
			System.out.println("stack is empty....");

		} else {
			for (int i = 0; i <= top; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();

		}
	}

	public static boolean isEmpty() {

		if (top == -1) {
			return true;
		} else {
			return false;
		}
	}

}
