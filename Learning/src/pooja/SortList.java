package pooja;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> lt = new ArrayList<>();
		lt.add(25);
		lt.add(35);
		lt.add(5);
		lt.add(40);
		lt.add(50);
		//int temp;
		Collections.sort(lt);
		System.out.println(lt);

	}

}
