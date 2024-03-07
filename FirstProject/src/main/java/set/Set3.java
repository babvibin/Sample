package set;

import java.util.HashSet;
import java.util.Set;

public class Set3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> obj=new HashSet<>();
		{
			obj.add(8);
			obj.add(2);
			obj.add(3);
			obj.add(8);
			obj.add(7);
			
			System.out.println(obj);
			
			System.out.println(obj.contains(8));
			System.out.println(obj.contains(1));		
		
		}	

	}

}
