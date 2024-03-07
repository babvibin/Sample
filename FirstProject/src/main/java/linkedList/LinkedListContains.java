package linkedList;

import java.util.LinkedList;

public class LinkedListContains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> obj= new LinkedList<String>();
		obj.add("Red");
		obj.add("Yellow");
		obj.add("Blue");
		boolean b= obj.contains("Red");
		System.out.println(b);
		
	}

}
