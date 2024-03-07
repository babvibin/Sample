package linkedList;

import java.util.LinkedList;

public class LinkedListRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> obj= new LinkedList<String>();
		
		obj.add("Red");
		obj.add("Yellow");
		obj.add("Blue");
		
		System.out.println(obj);
		obj.remove(0);		
		
		System.out.println(obj);

	}

}
