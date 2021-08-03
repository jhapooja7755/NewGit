package pooja;

public class FirstCharacterofWords {

	public static void main(String[] args) {
		String str = "i love you Manish";
		int i;
		for(i=0;i<str.length();i++)
		{
			if(i==0)
				System.out.println(str.charAt(i));
			if(str.charAt(i)==' ')
			{
				System.out.println(str.charAt(i+1));
			}
		}

	}

}
