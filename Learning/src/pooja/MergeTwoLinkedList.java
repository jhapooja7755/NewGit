package pooja;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoLinkedList {

	public static void main(String[] args) {
		
		List<Integer> l1 =new ArrayList<>();
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(5);
		System.out.println(l1);
		List<Integer> l2 =new ArrayList<>();
		l2.add(8);
		l2.add(9);
		l2.add(10);
		l2.add(11);
		System.out.println(l2);
		List<Integer> l3= new ArrayList<>();
				for(int i=0;i<l1.size();i++)
				{
					l3.add(l1.get(i));
				}
				for(int i=0;i<l2.size();i++)
				{
					l3.add(l2.get(i));
				}
				System.out.println(l3);
		

	}

}
