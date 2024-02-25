package inheritance;

class Bike extends Vehicle {
	public void display3()
	{
		System.out.println("Child Hierarchical Class: Bike");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike obj=new Bike();
		obj.display1();
		obj.displayProtect();
		obj.display3();
	}

}
