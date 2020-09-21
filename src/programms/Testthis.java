package programms;

import java.util.Arrays;
import java.util.Scanner;

public class Testthis {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int m=sc.nextInt();
			int ar[]=new int[n];
			int arr[]=new int[m];
			int res[]=new int[n+m];
			
			for (int i = 0; i < n; i++) {
				ar[i]=sc.nextInt();
				res[i]=ar[i];	
				}
			for (int i = 0; i <m; i++) {
				arr[i]=sc.nextInt();
				res[n+i]=arr[i];	
			}
			Arrays.sort(res);
			for (int i = 0; i < res.length; i++) {
				System.out.print(res[i]+" ");
			}
			System.out.println();
		
			//System.out.println(Arrays.toString(res));
			
				
		}
	}

}
