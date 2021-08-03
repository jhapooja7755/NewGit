package pooja;

public class Inversion {

	
	public static int getInversion(int a[],int n)
	{
		int count=0,i,j;
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					count++;
				}
			}
		}
		return count;
	}
	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5};
		int n=a.length;
		int output=getInversion(a,n);
		System.out.println(output);
		
		}
		

	}


