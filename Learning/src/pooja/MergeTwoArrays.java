package pooja;

public class MergeTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {1,2,3,4,5};
		int[] arr2= {6,7,8,9,10};
		int n1=arr1.length;
		int n2=arr2.length;
		int i;
		int arr3[] = new int[n1+n2];
		for(i=0;i<arr1.length;i++)
			arr3[i]=arr1[i];
		for(i=0;i<arr2.length;i++)
			arr3[n1+i]=arr2[i];
		
		for(i=0;i<arr3.length;i++)
		System.out.println(arr3[i]);
	}

}
