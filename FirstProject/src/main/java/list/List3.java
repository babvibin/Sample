package list;

import java.util.ArrayList;
import java.util.List;

public class List3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>obj=new ArrayList<Integer>();
		{
			obj.add(8);
			obj.add(2);
			obj.add(3);
			obj.add(8);
			obj.add(7);
			System.out.println(obj);
			int firstoccurance=obj.indexOf(8);
			System.out.println(firstoccurance);
			int lastoccurance=obj.lastIndexOf(8);
			System.out.println(lastoccurance);
			
		}		

	}

}
