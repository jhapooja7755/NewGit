package pooja;

public class Exceptions {

	public static void main(String[] args) throws Exception {
		try {
		String str = null;
		System.out.println(str.length());
		}
		catch(Exception e)
		{
			System.out.println("error");
		}

	}

}
