package pooja;

public class TripletsWithSumGivenRange {

	public static void main(String[] args) {
		
	    int[] arr = {8,3,5,2,6,4,1};
		int l=7,r=11;
		int count=0;
		int i,j,k;
		for(i=0;i<arr.length-2;i++)
		{
			for(j=i+1;j<arr.length-1;j++)
			{
				for(k=j+1;k<arr.length;k++)
				{
					if (arr[i] + arr[j] + arr[k] >= l && arr[i] + arr[j] + arr[k] <= r) 
                    {
                        count++;
                    } 
						
				}
			}
		}
		System.out.println(count);

	}

}
