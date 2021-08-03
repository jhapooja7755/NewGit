package pooja;

public class SortArrayAccordingToOther {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A1[] = {2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8};
		int A2[] = {2, 1, 8, 3};
		int A3[] = new int[A1.length];
		int i,j;
		for(i=0;i<A2.length;i++)
		{
			for(j=0;j<A1.length;j++) {
				if(A1[j]==A2[i])
				{
					A3[i]=A1[j];
					
				}
				
				
			}
			System.out.println(A3[i]);
			
		}

	}

}
