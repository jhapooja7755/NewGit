package pooja;

public class EvenWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "my name is pooja jha";
		String[] a= str.split(" ");
		for(String b:a)
		{
			if(b.length()%2==0)
			{
				System.out.println(b);
			}
		}

	}

}
