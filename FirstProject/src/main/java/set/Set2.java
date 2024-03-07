package set;

import java.util.HashSet;
import java.util.Set;

public class Set2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> obj=new HashSet<>();
		{
		obj.add("Red");
		obj.add("Blue");
		obj.add("Green");
			
		System.out.println(obj);
		
		obj.remove("Blue");
		System.out.println(obj);
		obj.add("Yellow");
		System.out.println(obj);
		}

	}

}
