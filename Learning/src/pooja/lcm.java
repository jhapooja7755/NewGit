package pooja;

public class lcm {
	
	public static int gcd(int a,int b)
	{
		if(b==0)
			return a;
		else
			return gcd(b,a%b);
	}
	public static int lcm(int a,int b)
	{
		return (a/gcd(a,b))*b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=20,b=30;
		int x=lcm(a,b);
		System.out.println(x);

	}

}
