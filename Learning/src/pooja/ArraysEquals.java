package pooja;

import java.util.Arrays;

public class ArraysEquals {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5};
		int brr[] = {1,2,3,4,5};
		int i,j;
		boolean test=false;
		for(i=0;i<arr.length;i++)
			for(j=0;j<brr.length;j++)
				if(Arrays.equals(arr, brr))
				{
					test=true;
					//break;
				}
		System.out.println(test);

	}

}
