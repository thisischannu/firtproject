package programms;

import java.util.Scanner;

public class HCF_and_LCM {

	    public static void main(String args[])
	    {
	        int a, b, x, y, t, hcf, lcm;
	        Scanner scan = new Scanner(System.in);
			
	        System.out.print("Enter Two Number : ");
	        x = scan.nextInt();
	        y = scan.nextInt();
			
	        a = x;
	        b = y;
			
	        while(b != 0)
	        {
	            t = b;
	            System.out.println("t val:"+t);
	            b = a%b;
	            System.out.println("b val:"+b);
	            a = t;
	            System.out.println("a val:"+a);
	            
	        }
			
	        hcf = a;
	        lcm = (x*y)/hcf;
			
	        System.out.print("HCF = " +hcf);
	        System.out.print("\nLCM = " +lcm);
	    }
	}


