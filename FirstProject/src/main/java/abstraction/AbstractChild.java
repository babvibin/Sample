package abstraction;

public class AbstractChild extends AbstractParent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractChild obj=new AbstractChild();
		obj.meth1();
	}

	@Override
	public void meth1() {
		// TODO Auto-generated method stub
		System.out.println("abstraction....");
	}

}
