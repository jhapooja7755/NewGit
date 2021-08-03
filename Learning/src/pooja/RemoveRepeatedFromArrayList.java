package pooja;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class RemoveRepeatedFromArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lt=new ArrayList<>(Arrays.asList("pooja","manish","papa","Mummy","pooja","papa"));
		List<String> lt1=new ArrayList<>();
		//Set<String> st=new HashSet<>();
		
		for(String Temp:lt)
		{
			if(!lt1.contains(Temp))
			{
				lt1.add(Temp);
			}
		}
		System.out.println(lt1);
		

	}

}
