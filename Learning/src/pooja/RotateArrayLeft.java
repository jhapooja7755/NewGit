package pooja;

public class RotateArrayLeft {
	
	public static void leftRotate(int arr[],int d,int n)
	{
		for(int i=0;i<d;i++)
		
			rotateArraybyOne(arr, n);
		
	}
	public static void rotateArraybyOne(int arr[],int n)
	{
		int temp, i;
		temp = arr[0];
		for(i=0;i<n-1;i++)
		
			arr[i] = arr[i+1];
			arr[i]=temp;
		
	}

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6};
		int n=arr.length;
		int d=2;

		leftRotate(arr,d,n);
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
