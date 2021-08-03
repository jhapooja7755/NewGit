package pooja;

public class ProductArray {

	public static void main(String[] args) {
		int arr[] = {10,3,5,6,2};
		//int arr1[] = new int[arr.length];
		int i;
		int product =1;
		for(i=0;i<arr.length;i++)
		{
			
			product = product*arr[i];

	}
		//System.out.println(product);
		for(i=0;i<arr.length;i++)
		{
			System.out.print(product/arr[i]+ " ");
		}
		

}
}