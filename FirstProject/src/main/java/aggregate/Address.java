package aggregate;

public class Address {	

	public void print(String address,Student s)
	{
		System.out.println(s.StudentName+ ";   " +s.rollNo+ ";   " +address);		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studnt=new Student("John Doe",28);
		
		Address addrs=new Address();
		addrs.print("6203 Starboard Ln, Tampa, FL 33611",studnt);

	}

}
