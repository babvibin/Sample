package inheritance;

class Car extends Vehicle {
	
public void display2()
{

	System.out.println("Child Hierarchical Class: Car");
}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Car obj=new Car();
		obj.display1();
		obj.display2();
	}

}
