package pooja;

import java.util.LinkedList;

public class reverseLL {

	public static void main(String[] args) {
		LinkedList<Integer> lt = new LinkedList<>();
		LinkedList<Integer> lt1 = new LinkedList<>();
		lt.add(1);
		lt.add(2);
		lt.add(3);
		lt.add(4);
		lt.add(5);
		int k=3;
		System.out.println(lt);
		for(int i=lt.size()-k;i>=0;i--)
		{
			lt1.add(lt.get(i));
		}
		for(int i=k;i<lt.size();i++)
		{
			lt1.add(lt.get(i));
		}
		System.out.println(lt1);

	}

}
