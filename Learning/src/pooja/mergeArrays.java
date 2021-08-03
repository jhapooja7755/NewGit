package pooja;

public class mergeArrays {

	public static void mergeTwoArrays(int a1[],int a2[],int n1,int n2,int a3[])
	{
		int i=0,j=0,k=0;
		while(i<n1&&j<n2)
		{
			if(a1[i]<a2[j])
				a3[k++]=a1[i++];
			else
				a3[k++]=a2[j++];
				
		}
		while(i<n1)
		{
			a3[k++]=a1[i++];
		}
		while(i<n1)
		{
			a3[k++]=a2[j++];
		}
	}
	
	public static void main(String[] args) {
		int a1[] = {2,4,6,8};
		int n1=a1.length;
		int a2[] = {1,3,5,7};
		int n2 = a2.length;
		int a3[] = new int[n1+n2];
		mergeTwoArrays(a1,a2,n1,n2,a3);
		for(int k=0;k<n1+n2;k++)
		{
			System.out.print(a3[k]);
		}
		
		


	}

}