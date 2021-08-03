package pooja;

import java.util.ArrayList;
import java.util.List;

public class SplitArrayList {

	public static void main(String[] args) {
	
		List<Integer> lt = new ArrayList<>();
		lt.add(25);
		lt.add(35);
		lt.add(5);
		lt.add(40);
		lt.add(50);
		
		
		List<Integer> lt1 = lt.subList(0, 3);
		List<Integer> lt2 = lt.subList(3, 5);
		System.out.println(lt);
		System.out.println(lt1);
		System.out.println(lt2);
		

	}

}
