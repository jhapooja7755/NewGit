package pooja;

public class RemoveLeadingZeroString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "000012356090";
		char[] ch=str.toCharArray();
		int i;
		for(i=0;i<ch.length;i++)
		{
			if(ch[i]!='0')
			{
				
				
				System.out.print(ch[i]);
				
			}
			
			
			
		}

	}

}
