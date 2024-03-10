package arrayList;

import java.util.ArrayList;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>obj=new ArrayList<String>();
		obj.add("Red");
		obj.add("Blue");
		obj.add("Green");
		obj.add("Yellow");
		obj.add("Orange");
		System.out.println(obj);
		
	//	System.out.println(obj.get(0));
	//	System.out.println(obj.get(1));
		
	/*	for(int i=0;i<=4;i++)
		{
			System.out.println(obj.get(i));			
		}
	*/
		
	//	obj.remove(2);
	//	System.out.println(obj);
		
		System.out.println(obj.contains("Green"));
	}

}
