package interfaceEx;

public class HDFC implements RBI {
	public static void main(String args[])
	{
	
	HDFC obj=new HDFC();
	obj.recurringDeposit(10000, 5);
	}

	@Override
	public void recurringDeposit(double amount, double durationYears) {
		// TODO Auto-generated method stub
		double accruedAmount=amount*(1+interestRate*durationYears);
		System.out.println("Total Accured Amount after " +durationYears+ " years is: " +accruedAmount);
				
	}

}
