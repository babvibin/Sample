package abstraction;

public class Contractor extends Employee{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contractor obj=new Contractor();
		obj.calculateSalary(8, 80);
		obj.calculateSalary(100);

	}

	@Override
	public void calculateSalary(int hours, int payment) {
		// TODO Auto-generated method stub
		int contractorSalary=hours*payment;
		System.out.println("Contractor Salary per day is: " +contractorSalary);		
	}
}
