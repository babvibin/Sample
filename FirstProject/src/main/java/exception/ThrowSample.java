package exception;

public class ThrowSample {
	public void display()
	{
		int age=15;
		if(age<18)
		{
			throw new ArithmeticException("Not Eligible");	
			
			//throw new NullPointerException("TEST");
			
		}
		else
		{
			System.out.println("Eligible");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowSample obj=new ThrowSample();
		obj.display();
	}

}
