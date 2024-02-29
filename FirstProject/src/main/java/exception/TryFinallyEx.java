package exception;

public class TryFinallyEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
		int a=10;
		int b=0;
		int c;
		c=a/b;
		}
		
		finally
		{
			System.out.println("Exception checked");
		}

	}
}
