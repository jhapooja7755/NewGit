package pooja;

public class SquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=25;
		double temp;
		double sqrt = x/2;
		if(x>0)
		{
			temp=sqrt;
		sqrt = (temp + (temp/x))/2;
		System.out.println(sqrt);
		}
	

	}

}
