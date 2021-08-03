package pooja;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CommonArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lt=new ArrayList<>(Arrays.asList("pooja","manish","papa","Mummy"));
		List<String> lt1=new ArrayList<>(Arrays.asList("shailja","manish","anu","Mummy"));
		List<String> lt3=new ArrayList<>();
	for(String temp:lt)
	{
		if(lt1.contains(temp))
		{
			lt3.add(temp);
		}
	}
	System.out.println(lt3);
			

	}

}
