package pooja;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,4,45,6,10,8};
		int i,j;
		int k=55;
		boolean isPresent = false;
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==k)
					isPresent =true;
			}
		}
		System.out.println(isPresent);
		

	}

}
