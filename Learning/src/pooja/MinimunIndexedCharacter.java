package pooja;

import java.util.HashSet;
import java.util.Set;

public class MinimunIndexedCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="geeksforgeeks";
		String s2="set";
		int j,i;
		int min = Integer.MAX_VALUE;
		for(i=0;i<s2.length();i++)
		
			for(j=0;j<s1.length();j++)
			
				if(s2.charAt(i)==s1.charAt(j)&&j<min)
				{
					min=j;
					break;
					
				}
				System.out.println(s1.charAt(min));
			
			
		
			
			
			
		
		

	}

}
