package pooja;

public class NumberPairs {

	public static void main(String[] args) {
		int a1[] = {2,1,6,4,2};
		int a2[] = {1,5,3};
		int count =0;
		for(int i=0;i<a1.length;i++)
		{
			for(int j=0;j<a2.length;j++)
			{
				if(Math.pow(a1[i], a2[j])>Math.pow(a2[j], a1[i]))
					count++;
			}
		}
		System.out.println(count);

	}

}
