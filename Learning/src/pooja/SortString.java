package pooja;

import java.util.Arrays;

public class SortString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="geegkforgeeks";
		char[] ch=str.toCharArray();
		Arrays.sort(ch);
		for(int i=0;i<ch.length;i++)
			System.out.print(ch[i]);

	}

}
