
package pooja;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,6,1,3,2,4};
		int i,j;
		for(i=0;i<arr.length;i++)
		{
			for(j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]= temp;
					//System.out.println(arr[i]);
					
				}
				
		
			}
			System.out.println(arr[i]);
		}
	
		
		

	}

}
