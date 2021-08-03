package pooja;

import java.util.Arrays;

public class CountNoOfTriangle {

	public static void main(String[] args) {
		int arr[] = { 10, 21, 22, 100, 101, 200, 300 };
		
		int count=0;
		int i,j,k;
		for(i=0;i<arr.length;i++) {
			//Arrays.sort(arr);
			for(j=i+1;j<arr.length;j++)
			{
				for(k=j+1;k<arr.length;k++)
				
					if(arr[i]+arr[j]>arr[k]&&arr[j]+arr[k]>arr[i]&&arr[k]+arr[i]>arr[j])
						count++;
				
			}
			
		}
		System.out.println(count);
		
		

	}

}
