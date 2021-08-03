package pooja;

public class MaximumIndex {

	public static void main(String[] args) {
		int arr[] = {34, 8, 10, 3, 2, 80, 30, 33, 1};
		int i ,j;
		int maxdiff = -1;
		for(i=0;i<arr.length;i++)
		{
			for(j=arr.length-1;j>i;j--) {
				if(arr[i]<arr[j]&&maxdiff<j-i)
				{
					maxdiff=j-i;
				}
			}
		}
		System.out.println(maxdiff);
		

		

	}

}
