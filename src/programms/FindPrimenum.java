package programms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindPrimenum {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader  br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter no of test cases");
		int t =Integer.parseInt(br.readLine());
		
		while (t-->0) {
			int n=Integer.parseInt(br.readLine());
			boolean isrpime=true;
			if (n<=1) {
				isrpime=false;
			}
			for(int i=2;i<=n;i++) {
			for (int j =2; j<i; j++) {
				if(i%j==0) {
					isrpime=false;
				}
			}
			if (isrpime) {
				System.out.print(i+" ");
			}
			else {
				isrpime=true;
			}
			}
		
			
		}
		
		

	}

}
