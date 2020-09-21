package programms;

import java.util.Scanner;

public class MagicalWord {

	public static void main(String[] args) {
		System.out.println("enter test case");
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		String s="";
		
		while (t-->0) {
			
		String str=sc.next();
		//Boolean isPrime=true;
		for(int i=0;i<str.length();i++) {
		int x=str.charAt(i);
		
		boolean prime=findPrime(x);
		
		if(prime) {
			s+=(char)x;
			System.out.println("prim :"+s);
		}
		else {
			boolean found=false;
			int c=1;
			int tem=x;
			loop:for(int j=1;j<=2;j++) {
				tem-=c;
				//System.out.println("cmoing here"+x);
				prime=findPrime(tem);
				if(prime) {
					found=true;
					s+=(char)tem;
					//System.out.println("prime here:"+tem);
					break loop;
				}
			}
			c++;
			if(!found) {
				int c1=1;
				int tem1=x;
				loop:for(int j=1;j<=2;j++) {
					tem1+=c1;
					//System.out.println("cmoing here"+x);
					prime=findPrime(tem1);
					if(prime) {
						found=true;
						s+=(char)tem1;
						//System.out.println("prime here:"+tem1);
						break loop;
					}
				}
				c1++;
			}
		}
		}
		System.out.println("final ::"+s);
		
		}
	}

	public static boolean findPrime(int x) {
		
		boolean isPrime=true;
		for(int i=2;i<=x/2;i++) {
			if(x%i==0) {
				isPrime=false;
				break;
			}
			
		}
		return isPrime;
	}
}
		
		
//AWGrOwUcFWnghtAyvxSb
//CYGqOSaGYmggCSa
		
		
		
		
		
		
		

	


