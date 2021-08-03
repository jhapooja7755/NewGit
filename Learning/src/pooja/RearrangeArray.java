package pooja;

public class RearrangeArray {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6};
		int n=arr.length;
		int min_index = 0;
		int max_index = n-1;
		int max = arr[n-1] + 1;
		for(int i=0;i<n;i++)
		{
			if(arr[i]%2!=0)
			{
				arr[i] = (arr[max_index]%max)*max + arr[i];
				max_index--;
			}
			else if(arr[i]%2==0)
			{
				arr[i] = (arr[min_index]%max)*max + arr[i];
				min_index++;
			}
		}
		for(int i=0;i<n;i++)
		{
			arr[i] = arr[i]/max;
			System.out.print(arr[i]);
		}
		

	}

}
