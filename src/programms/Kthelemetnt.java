package programms;

import java.util.Arrays;
import java.util.Scanner;

public class Kthelemetnt {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter test no case...");
	int t=sc.nextInt();
	while(t-->0) {
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
			}
		int k=sc.nextInt();
		
		Arrays.sort(ar);
		System.out.println(ar[k-1]);
		
		
	}

	
	
	}

}
