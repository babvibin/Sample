package excelRead;

import java.io.IOException;

public class Excel2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String o=ExcelRead.getStringData(1,0);
		System.out.println(o);
		String b=ExcelRead.getIntegerData(1,1);
		System.out.println(b);
		

	}

}
