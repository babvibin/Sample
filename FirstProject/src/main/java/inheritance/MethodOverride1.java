package inheritance;

public class MethodOverride1 extends MethodOverride{
	public void display()
	{
		System.out.println("Method of Child Class");
		super.display();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverride1 obj=new MethodOverride1();
		obj.display();
	}

}
