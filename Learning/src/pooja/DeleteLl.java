package pooja;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DeleteLl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=20;
		//int temp;
		List<Integer> lt = new ArrayList<>();
		lt.add(10);
		lt.add(20);
		lt.add(4);
		lt.add(30);
		List<Integer> lt1 = new ArrayList<>();
		//System.out.println(lt);
		for(Integer temp:lt)
		{
			if(!temp.equals(k))
			{
				lt1.add(temp);
			}
		}
		System.out.println(lt1);
		
		
		
		

	}

}
