package abstraction;

public abstract class Employee {
	public abstract void calculateSalary(int hours, int payment);
	public void calculateSalary(int payment)
	{
		int fullTimeEmployeeSalary=8*payment;
		System.out.println("Full Time Employee Salery per day is: " +fullTimeEmployeeSalary);
	}

}
