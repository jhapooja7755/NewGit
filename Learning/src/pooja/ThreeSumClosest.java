package pooja;

public class ThreeSumClosest {

	public static void main(String[] args) {
		
		int arr[] = {5,9,8,3,1,1};
		int n=arr.length;
		int i,j,k;
		//int given_sum=10;
		int sum=10;
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				for(k=j+1;k<n;k++)
				{
					if(arr[i]+arr[j]+arr[k]==sum)
					
						System.out.println(arr[i]+","+arr[j]+","+arr[k]);
					
					
					
				}
			}
		

		}
		
		
	}

}
