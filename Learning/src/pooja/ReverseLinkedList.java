package pooja;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ReverseLinkedList {

	public static void main(String[] args) {
		List<Integer> lt = new LinkedList<>();
		lt.add(1);
		lt.add(2);
		lt.add(3);
		lt.add(4);
		System.out.println(lt);
		
		List<Integer> revlt = new LinkedList<>();
		for(int i=lt.size()-1;i>=0;i--)
		{
		revlt.add(lt.get(i));
		}
		System.out.println(revlt);
			
			
		
		
	
	

	}

}
