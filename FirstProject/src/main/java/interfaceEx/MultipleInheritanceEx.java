package interfaceEx;

public class MultipleInheritanceEx implements Interface1, Interface2 {

	@Override
	public void display2() {
		// TODO Auto-generated method stub
		System.out.println("Abstract Method of Interface2");

	}

	@Override
	public void display1() {
		// TODO Auto-generated method stub
		System.out.println("Abstract Method of Interface1");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleInheritanceEx obj=new MultipleInheritanceEx();
		obj.display1();
		obj.display2();	

	}

}
