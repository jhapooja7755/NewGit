package pooja;

public class missingNoArray {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,15};
		int n=15;
		int sum = 0;
		int sum1;
		sum1= n*(n+1)/2;
		for(int i=0;i<arr.length;i++)
		{
			sum = sum+arr[i];
		}
		int nm = sum1-sum;
		System.out.println(nm);

	}

}
