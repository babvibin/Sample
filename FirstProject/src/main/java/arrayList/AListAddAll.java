package arrayList;

import java.util.ArrayList;

public class AListAddAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>obj=new ArrayList<String>();
		obj.add("Red");
		obj.add("Yellow");
		obj.add("Blue");
		
		ArrayList<String>obj2=new ArrayList<String>();
		obj2.add("Java");
		obj2.add("Phython");
		obj2.add("C");
		
		obj.addAll(obj2);
		System.out.println(obj);
		
	}

}
