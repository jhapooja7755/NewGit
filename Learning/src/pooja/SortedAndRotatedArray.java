package pooja;

public class SortedAndRotatedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {5,6,7,8,9,10,1,2,3};
		int k=10;
		boolean test = false;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==k)
			{
				test = true;
				break;
			}
			
			
		}
		System.out.println(test);
		

	}

}
