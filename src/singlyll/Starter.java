package singlyll;

import java.util.Scanner;

public class Starter {

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();

//		Scanner sc=new Scanner(System.in);
//		System.out.println("plz enter no");
//		int ip=sc.nextInt();
//		
//		while (true) {
//			switch (ip) {
//			case 1:
//				System.out.println("insert no");
//				int num=sc.nextInt();
//				ll.insert(num);
//				break;
//			case 2: 
//			ll.show();
//				break;
//
//			default:
//				break;
//			}
//		}
//		
		ll.insert(23);
		ll.insert(24);
		ll.insert(234);
		ll.insert(235);
//		ll.insertFirst(233);
//		ll.insertAt(4, 266);
		ll.show();

	}

}
