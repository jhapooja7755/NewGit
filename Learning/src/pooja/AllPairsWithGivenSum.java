package pooja;

public class AllPairsWithGivenSum {

	public static void main(String[] args) {
		
		int a[] = {1, 2, 4, 5, 7};
		int b[] = {5, 6, 3, 4, 8}; 
		int k=9;
		int i,j;
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<b.length;j++)
			{
				if(a[i]+b[j]==k)
					System.out.println(a[i]+","+b[j]);
			}
		}

	}

}
