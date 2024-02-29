package exception;

public class CustomeExceptionEx {
	public void display(int age)
	{
		if(age<18)
		{
			throw new AgeException("Not Eligible");
		}
		else
		{
			System.out.println("Eligible");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomeExceptionEx obj=new CustomeExceptionEx();
		obj.display(15);

	}

}
