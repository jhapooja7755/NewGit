package pooja;

public class abcd {

	
	public static void main(String[] args) {
		
		int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
		int max_so_far = 0, max_ending = 0;
		for(int i=0;i<arr.length;i++)
		{
			max_ending = max_ending+arr[i];
			if(max_ending<0)
			{
				max_ending=0;
			}
			if(max_ending>max_so_far)
			{
				max_so_far = max_ending;
			}
			
		}
		System.out.println(max_so_far);
		
	
	

}
}
