package polymorphism;

public class Child1 extends Parent1 {
	public void display()
	{
		System.out.println("Child Class Method");		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Child1 obj=new Child1();
		//Child1 obj=new Parent1();  //This is a wrong code.
		
		Parent1 obj=new Child1();
		obj.display();

	}

}
