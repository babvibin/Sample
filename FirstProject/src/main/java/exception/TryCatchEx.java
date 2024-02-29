package exception;

import javax.swing.JSpinner.NumberEditor;

public class TryCatchEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
		int a=10;
		int b=0;
		int c;
		c=a/b;
		}		
		
		catch(ArithmeticException a)
		{
				System.out.println("Exception Occured. Please Skip...  " +a);				
		}		
		
	}
}
