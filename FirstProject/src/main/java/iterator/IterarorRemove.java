package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IterarorRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>obj=new ArrayList<String>();
		obj.add("A");
		obj.add("B");
		obj.add("C");
		
		System.out.println(obj);
		
		Iterator<String> it=obj.iterator();
		while(it.hasNext())
		{
			
			System.out.println(it.next());
			
		}
		
		it.remove();
		
		System.out.println(obj);


	}

}
