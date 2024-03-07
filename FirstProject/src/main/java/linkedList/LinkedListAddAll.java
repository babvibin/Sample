package linkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListAddAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>obj=new LinkedList<String>();
		obj.add("Red");
		obj.add("Yellow");
		obj.add("Blue");
		System.out.println(obj);
		
		LinkedList<String>obj2=new LinkedList<String>();
		obj2.add("Java");
		obj2.add("Phython");
		obj2.add("C");
		System.out.println(obj2);
		
		obj.addAll(obj2);
		System.out.println(obj);

	}

}
