package pooja;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> lt = new ArrayList<>();
		Set<Integer> lt1 = new HashSet<>();
		
		lt.add(25);
		lt.add(35);
		lt.add(5);
		lt.add(40);
		lt.add(50);
		lt.add(5);
		lt.add(35);
		//lt.toArray();
		for(int i=0;i<lt.size();i++)
		{
			lt1.addAll(lt);
			
		}
		System.out.println(lt1);
		

	}

}
