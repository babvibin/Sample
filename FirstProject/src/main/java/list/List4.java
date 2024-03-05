package list;

import java.util.ArrayList;
import java.util.List;

public class List4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>obj=new ArrayList<String>();
		{
			obj.add("A");
			obj.add("B");
			obj.add("C");
			obj.add("A");
			obj.add("A");
			int firstoccurance=obj.indexOf("A");
			System.out.println(firstoccurance);
			int lastoccurance=obj.lastIndexOf("A");
			System.out.println(lastoccurance);
			
		}		

	}

}
