package programms;

import java.util.Scanner;

public class SeatingArrangements {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter test case");
		int t = sc.nextInt();
		int i=0,j,d,c,a;
		while (t-->0) {
			//System.out.println("enter input..");
			a=sc.nextInt();
			c=a%12;
			//System.out.println("input c:"+c);
			
			if(c==0)
				d=12;
			else
				d=c;
			
			//System.out.println("value of d:;"+d);
			System.out.print(a+(13-(2*d))+" ");
			
			if((c==1)||(c==6)||(c==7)||(c==0)) {
				System.out.println("WS");
			}
			else if((c==11)||(c==2)||(c==5)||(c==8)) {
				System.out.println("MS'");
			}
			else {
				System.out.println("AS");
			}
			
		}
		
		
	
	}

}
