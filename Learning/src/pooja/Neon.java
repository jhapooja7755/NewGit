package pooja;

public class Neon {

	public static void main(String[] args) {
		int n= 9;
		int square = n*n;
		int sum=0;
		int r;
		while(square>0)
		{
			r=square%10;
			sum= sum+r;
			square=square/10;
			
			
		}
		if(sum==n)
		{
			System.out.println("neon");
		}
		else
		{
			System.out.println("not neon");
		}
		

	}

}
