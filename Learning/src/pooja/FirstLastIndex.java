package pooja;

public class FirstLastIndex {

	public static void main(String[] args) {


		int arr[] = {1, 3, 5, 5, 5, 5, 67, 123, 125};
		int n=arr.length;
		int x =5;
		int i=0;
		for(i=0;i<n;i++)
	
		{
			if(arr[i]==x)
			{
				System.out.print(i);
			break;
			
			}
		}
		for(i=n-1;i>=0;i--)
		{
			if(arr[i]==x)
			{
				System.out.print(" " +i);
				break;
			}
		}
//i++;
	}

}
