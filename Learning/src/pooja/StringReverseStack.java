package pooja;

import java.util.Stack;

public class StringReverseStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="poojajha";
		char[] ch=str.toCharArray();
		char[] ch1=new char[str.length()];
		Stack<Character> st=new Stack<>();
		int i;
		for(i=0;i<ch.length;i++)
		{
			st.push(ch[i]);
		}
		int j=0;
		while(!st.isEmpty())
		{
			ch1[j++]=st.pop();
		}
		System.out.println(ch1);
		

	}

}
