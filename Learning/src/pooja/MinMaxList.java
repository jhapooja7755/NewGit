package pooja;

import java.util.ArrayList;
import java.util.List;

public class MinMaxList {

	public static void main(String[] args) {
		
		List<Integer> lt = new ArrayList<>();
		lt.add(25);
		lt.add(35);
		lt.add(5);
		lt.add(40);
		
		int min = lt.get(0);
		int max =lt.get(0);
		//System.out.println(min);
		for(int i=0;i<lt.size();i++)
		{
			if(lt.get(i)<min)
				min=lt.get(i);
				
			
		}
		System.out.println(min);
		for(int i=0;i<lt.size();i++)
		{
			if(lt.get(i)>max)
				max=lt.get(i);
				
			
		}
		System.out.println(max);

	}

}
