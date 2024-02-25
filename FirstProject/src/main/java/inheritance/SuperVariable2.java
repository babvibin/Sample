package inheritance;

public class SuperVariable2 extends SuperVariable1 {
	public void meth()
	{
		int num=20;
		System.out.println(+num);
		System.out.println(super.num);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SuperVariable2 obj=new SuperVariable2();
		obj.meth();

	}

}
