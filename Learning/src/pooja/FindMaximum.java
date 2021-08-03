package pooja;

public class FindMaximum {

	public static void main(String[] args) {
		int arr[] = {12,25,27,30,5,8};
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println(min);

	}

}
