package pooja;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class RemoveDuplicate {

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,3,4,5};
		
		int temp[] = new int[arr.length];
		int i,j=0;
		for(i=0;i<arr.length-1;i++)
		
			
				if(arr[i]!=arr[i+1])
					temp[j++]= arr[i];
				temp[j++]= arr.length-1;
			
			for(i=0;i<j;i++)
			
				System.out.println(arr[i]=temp[i]);
			
		
		
		
	
	
		
	}
		

	}


