package pooja;

public class SwapeachPairString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "geeksforgeeks";
		char[] ch=str.toCharArray();
		char temp;
		int i;
		for(i=0;i<ch.length-1;i+=2)
		{
			temp=ch[i];
			ch[i] = ch[i+1];
			ch[i+1]=temp;
			
		}
		System.out.println(ch);
		

	}

}
