package pooja;

public class alternatePositiveNegative {

	public static void main(String[] args) {
		int Arr[] = {9, 4, -2, -1, 5, 0, -5, -3, 2};
		int i;
		for(i=0;i<Arr.length;i+=2)
		{
			for(int j=i+i;j<Arr.length;i+=2)
			{
				if(Arr[j]<0)
				{
					int temp=Arr[j];
					Arr[j]=Arr[i];
					Arr[i]=temp;
				}
			}
			for(i=0;i<Arr.length;i++)
			{
			System.out.println(Arr[i]);
			}
		}
		

	}

}
