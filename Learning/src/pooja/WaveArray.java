package pooja;

public class WaveArray {
	
	public static void swap(int arr[],int a,int b) {
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
		
	}
	public static void sortWave(int arr[],int n)
	{
		for(int i=0;i<n-1;i+=2)
		{
			swap(arr,i,i+1);
		}
	}

	public static void main(String[] args) {
		
		
	
		int[] arr = {1,2,3,4,5};
		
		int n=arr.length;
		sortWave(arr,n);
		
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		


	}

}
