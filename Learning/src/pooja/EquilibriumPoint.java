package pooja;

public class EquilibriumPoint {

	public static void main(String[] args) {
		int arr[] = {1,3,5,2,2};
		int i,j;
		int leftsum=0;
		int rightsum=0;
		for( i=0;i<arr.length;++i)
		{
			leftsum=0;
			for(j=0;j<i;j++)
			
				leftsum+=arr[j];
			rightsum=0;
			for(j=i+1;j<arr.length;j++)
			
				rightsum+=arr[j];
			if(leftsum==rightsum)
			{
				System.out.println(arr[i]);
			}
			
		}
		
		
		
		}
		

	

}
