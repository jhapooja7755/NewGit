package pooja;

import java.util.ArrayList;
import java.util.List;

public class CommaSeperatedListString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lt = new ArrayList<>();
		lt.add("meetu");
		lt.add("pooja");
		lt.add("anu");
		lt.add("khushboo");
		lt.add("nidhi");
		lt.add("shailja");
		System.out.println(lt);
		String str=String.join(",", lt);
		System.out.println(str);

	}

}
