package pooja;

public class Pangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcdefghijklmnopqrstuvwx";
		//str =str.replaceAll("","").toLowerCase();
		System.out.println(str);
		String s="";
		for(char i='a';i<='z';i++)
		{
			if(str.indexOf(i)!=-1)
			{
				s=s+i;
			}
		}
		if(s.length()==26)
		{
			System.out.println("panagram");
		}
		else
		{
			System.out.println("not panagram");
		}

	}

}
