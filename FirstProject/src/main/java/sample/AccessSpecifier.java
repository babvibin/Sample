package sample;

public class AccessSpecifier {
	public void print1()
	{
		System.out.println("public");
	}
	private void print2()
	{
		System.out.println("private");
	}
	
	void print3()
	{
		System.out.println("default");
	}
	
	protected void print4()
	{
		System.out.println("protected");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessSpecifier obj=new AccessSpecifier();
		obj.print1();
		obj.print2();
		obj.print3();
		obj.print4();
		
	}

}
