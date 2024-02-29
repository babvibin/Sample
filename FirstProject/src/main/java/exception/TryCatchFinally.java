package exception;

public class TryCatchFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			int a=10, b=0, c;
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
