package pooja;

import java.util.ArrayList;
import java.util.List;

public class Sublist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> lt = new ArrayList<>();
		lt.add(10);
		lt.add(20);
		lt.add(30);
		lt.add(40);
		List<Integer> lt1=lt.subList(0, 3);
		System.out.println(lt);
		System.out.println(lt1);

	}

}
