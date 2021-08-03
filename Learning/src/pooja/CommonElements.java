package pooja;

import java.util.HashSet;
import java.util.Set;

public class CommonElements {

	public static void main(String[] args) {
		
		int[] a1={1, 5, 10, 20, 40, 80,10};
		int[] a2={6, 7, 20, 80, 100,10,10};
		
		int i,j;
		Set<Integer> s1=new HashSet<Integer>();
		Set<Integer> s2=new HashSet<Integer>();
		for(i=0;i<a1.length;i++)
			s1.add(a1[i]);
		for(i=0;i<a2.length;i++)
			s2.add(a2[i]);
		if(s1.retainAll(s2))
			System.out.println(s1);

	}

}
