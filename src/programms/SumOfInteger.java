package programms;

import java.util.Scanner;

public class SumOfInteger {

	public static void main(String[] args) {
		

	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0){
	        	
		String str = sc.next();
		int sum=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>=48&&str.charAt(i)<=57) {
				sum+=Integer.parseInt(String.valueOf(str.charAt(i)));
			}
		}
		System.out.println(sum);
	    }
	}

}
