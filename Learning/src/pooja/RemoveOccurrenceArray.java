package pooja;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveOccurrenceArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int[] array = { 3, 9, 2, 3, 1, 7, 2, 3, 5 };
		int i,j=0;
		int key=3;
		for(i=0;i<array.length;i++)
		if(array[i]!=key)
			array[j++] = array[i];
		Arrays.copyOf(array, j);
		System.out.println(Arrays.toString(array));*/
		
		int arr[] = { 3, 9, 2, 3, 1, 7, 2, 3, 5 };
		int key=3;
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=key)
			{
				list.add(arr[i]);
			}
			
		}
		System.out.println(list);
		
		int brr[]=list.stream().mapToInt(Integer::intValue).toArray();
		System.out.println(Arrays.toString(brr));
		
		
			
		

	}

}
