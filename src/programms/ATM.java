
package programms;

import java.io.*;
import java.lang.*;
import java.util.*;
class ATM{
public static void main (String args[]) throws java.lang.Exception {
try{
	Scanner sc=new Scanner(System.in);
	int amt=sc.nextInt();
	double total=sc.nextDouble();
	
	if(amt%5==0) {
		double a=amt;
		if(total>=(a+0.50)) {
			total=total-(a+0.50);
			
		}
		
	}
	System.out.println(total);
	
}
catch(Exception e){return;}
}}



















































//int amount;
//double balance;
//Scanner sc = new Scanner(System.in);
//amount = sc.nextInt();
//balance= sc.nextDouble();
//if(amount%5==0){
//double a= amount;
//if(balance>=(a+0.50)){
//balance-=(a+0.50);}}	
//System.out.println(balance);