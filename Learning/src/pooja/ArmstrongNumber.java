package pooja;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int n=153;
		int sum=0;
		int temp=n;
		int r;
		while(n>0)
		{
			r=n%10;
			sum=sum+r*r*r;
			n=n/10;
			
		}
		if(temp==sum)
		{
			System.out.println("armstrong");
		}
		else
		{
			System.out.println("not armstrong");
		}

	}

}
