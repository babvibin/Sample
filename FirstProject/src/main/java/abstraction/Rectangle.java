package abstraction;

public class Rectangle extends Shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle obj=new Rectangle();
		obj.meth();
		obj.display();
	}

	@Override
	public void meth() {
		// TODO Auto-generated method stub
		System.out.println("This is the abstract method body");
	}

}
