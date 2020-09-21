package programms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class TwoIdenticalstrings {

	public static void main(String[] args) throws IOException {
		
		  BufferedReader  br=new BufferedReader(new InputStreamReader(System.in));
			int t =Integer.parseInt(br.readLine());
			boolean flag=true;
			while (t-->0) {
				
				String s=br.readLine();
				
				String[] str = s.split("\\s");
				
				String a=str[0];
				String b=str[1];
				
			char[] sort = a.toCharArray();
				char[] sort1 = b.toCharArray();
				Arrays.sort(sort);
				Arrays.sort(sort1);
				String str1=new String(sort);
				String str2=new String(sort1);
				
				if (str1.equalsIgnoreCase(str2)) {
					System.out.println("YES");
				}
				else {
					System.out.println("NO");
				}
		}
			
	}

}
