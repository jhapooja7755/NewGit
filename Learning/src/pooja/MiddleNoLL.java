package pooja;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MiddleNoLL {

	public static void main(String[] args) {
		List<Integer> lt = new LinkedList<>();
		lt.add(1);
		lt.add(2);
		lt.add(3);
		lt.add(4);
		lt.add(5);
		lt.add(6);
		lt.add(7);
		lt.add(8);
		int mn = lt.get(lt.size()/2);
		System.out.println(mn);
		
		}
		
	

	}


