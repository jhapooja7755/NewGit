package pooja;

import java.util.ArrayList;
import java.util.List;

public class CommonElementsArray {

	public static void main(String[] args) {
		
		String[] ch1 = {"a", "b", "c", "d", "e", "f"}; 
	    String[] ch2 = {"b", "d", "e", "h", "g", "c"};
	    int i,j;
	    //char ch;
	    List<String> list = new ArrayList<>();
	    
	    for(i=0;i<ch1.length;i++)
	    {
	    	for(j=0;j<ch2.length;j++)
	    	{
	    		//boolean ch;
				if((ch1[i]==ch2[j]))
	    		{
					list.add(ch1[i]);
					break;
	    			
	    		}

	}

}
	    System.out.println(list);
	   
}
}