package pooja;

import java.util.Arrays;

public class MajorityElement {

	public static void main(String[] args) {
		
		int arr[] = {1,3,2,3,3,4};
		int count;
		int max_count=0;
		int index=-1;
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			count=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					
				}
				if(count>max_count)
				{
					max_count = count;
					index=i;
				}
			}
			
			
		}
		System.out.println(max_count);
		if(max_count>arr.length/2)
		{
			System.out.println("majority element");
		}
		else
		{
			System.out.println("no majority");
		}
		
		

	}

}
