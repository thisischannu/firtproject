package programms;

import java.util.Arrays;

public class BinarySort {

	public static void main(String[] args) {
		
		int arr[]= {64, 34, 25, 12, 22, 11, 90};
		
		for(int i=0;i<arr.length;i++) {
			for (int j = 0; j < arr.length-i-1; j++) {
				
				if(arr[j]>arr[j+1]) {
					System.out.println("i:"+arr[i]+" "+" j:"+arr[j+1]);
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				} 
				
			}
		}
		System.out.println(Arrays.toString(arr));
		

	}

}
