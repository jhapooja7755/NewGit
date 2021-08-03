package pooja;

import java.util.ArrayList;
import java.util.List;

public class RemoveSublist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> lt = new ArrayList<>();
		lt.add(25);
		lt.add(35);
		lt.add(5);
		lt.add(40);
		lt.add(50);
		lt.subList(1, 3).clear();
		System.out.println(lt);

	}

}
