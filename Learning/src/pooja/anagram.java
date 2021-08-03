package pooja;

import java.util.Arrays;

public class anagram {

	public static void main(String[] args) {
		String S1="abdc";
		String S2 = "dbace";
		S1.toLowerCase();
		S2.toLowerCase();
		if(S1.length()!=S2.length())
		{
			System.out.println("not an anagram");
		}
		char ch1[] = S1.toCharArray();
		char ch2[] = S2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		System.out.println(ch1);
		
		System.out.println(ch2);
		if(Arrays.equals(ch1, ch2))
		{
			System.out.println("anagram");
		}
		else
		{
			System.out.println("not an anagram");
		}


	}

}
