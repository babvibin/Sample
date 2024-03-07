package list;

import java.util.ArrayList;
import java.util.List;

public class List2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> obj=new ArrayList<>();
		{
			obj.add("Red");
			obj.add("Blue");
			obj.add("Green");
			System.out.println(obj);
			
			obj.set(1, "Yellow");	
			
			System.out.println(obj);
		}

	}

}
