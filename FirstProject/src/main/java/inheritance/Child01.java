package inheritance;

public class Child01 extends Parent01 {
	public void display()
	{
		System.out.println("Method from Child");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parent01 obj1=new Parent01();
		obj1.display1();
				
		System.out.println(" ");
		Parent01 obj2=new Child01();
		obj2.display1();
		
		System.out.println(" ");
		Child01 obj3=new Child01();
		obj3.display();
		obj3.display1();

	}

}
