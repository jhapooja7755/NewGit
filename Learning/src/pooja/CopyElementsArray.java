package pooja;

public class CopyElementsArray {

	public static void main(String[] args) {
		
		int i;
		int arr[] = {1,2,3,4,5};
		int brr[] = new int[arr.length];
		for(i=0;i<arr.length;i++)
		{
			
			
			brr[i] = arr[i];
			System.out.print(brr[i]);
			
			
		}
		//System.out.print(brr[i]);
		//System.out.println();
		for(i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}

	}

}
