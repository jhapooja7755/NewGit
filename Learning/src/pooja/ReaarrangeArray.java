package pooja;

public class ReaarrangeArray {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6};
		int n=arr.length;
		int i,j;
		for(i=0;i<n;i++)
		{
			for(j=n-1;j>0;j--)
			{
			arr[i]=arr[j];
		}
			System.out.println(arr[i]);
		}
		

	}

}
