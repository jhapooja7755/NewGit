package pooja;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class AddFirstandlastPositionLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> lt=new LinkedList<>(Arrays.asList("pooja","manish","papa","Mummy"));
		System.out.println(lt);
		lt.addFirst("meetu");
		lt.addLast("shailja");
		System.out.println(lt);
		
		

	}

}
