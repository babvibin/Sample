package set;

import java.util.HashSet;
import java.util.Set;

public class Set4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> obj=new HashSet<String>();
		{
			obj.add("JOHN");
			obj.add("Bob");
			obj.add("JOHN");
			obj.add("Ted");
			obj.add("john");

			System.out.println(obj);
			
			System.out.println(obj.contains("Bob"));
			System.out.println(obj.contains("Jim"));	
			
		
			
		}		

	}

}
