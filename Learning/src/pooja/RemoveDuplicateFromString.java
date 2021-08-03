package pooja;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateFromString {

	public static void main(String[] args) {
		
		String str= "abbccdd";
		Set<String> st = new HashSet<>();
		for(int i=0;i<str.length();i++)
		{
			st.add(str);
		}
		System.out.println(st);
		
		

	}

}
