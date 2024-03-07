package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Iteraor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>obj=new ArrayList<String>();
		obj.add("Red");
		obj.add("Yellow");
		obj.add("Blue");
		
		Iterator<String> it=obj.iterator();
		while(it.hasNext())
		{
			
			System.out.println(it.next());
		}
		
		
	}

}
