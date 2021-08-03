package pooja;

import java.util.Arrays;

public class LongestSubsequence {

	public static void main(String[] args) {
		
		int a[] = {2,6,1,9,4,5,3};
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
		for(int j=i+1;j<a.length;j++)
		{
		if(a[j]-a[i]>1)
		
		
			break;
		
		System.out.println(a[i]);

		}
		
		}

	}

}
