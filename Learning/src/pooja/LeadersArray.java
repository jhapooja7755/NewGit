package pooja;

public class LeadersArray {

	public static void main(String[] args) {
		int a[]= {16,17,4,3,5,2};
		int n=a.length;
		for(int i=0;i<n;i++)
		{
			boolean isleader= true;
			int j;
			for(j=i+1;j<n;j++)
			{
				if(a[i]<=a[j])
				{
				
					isleader = false;
					break;
				}
				
				
				
				
			}
if(isleader)
				
				System.out.println(a[i]);
		}

	}

}
