package pooja;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		
		int arr[] = {2,5,1,12,8,4,11};
		int key=7;
		Arrays.sort(arr);
		int i = Arrays.binarySearch(arr, key);
		if(i>=0)
		{
			System.out.println(key +" found at index "+ i);
		}
		else if(i<=0)
		{
			System.out.println("key not found");
		}
	}

}
