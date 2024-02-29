package exception;

public class TryCatchFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10, b=0, c;
		
		try
		{			
			c=a/b;
		}
		catch(Exception e)
		{
			System.out.println("Exception is:  " +e);
		}
		finally
		{
			System.out.println("Statement from the Finally function");
		}

	}

}
