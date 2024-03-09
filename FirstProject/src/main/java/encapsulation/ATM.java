package encapsulation;

public class ATM {
	private int pin;
	public void setPin(int pin)
	{
		this.pin=pin;
	}
	public void getValidatePIN()
	{
		switch(pin) 
		{
		case 1001:
			System.out.println(pin);
			break;
		case 1234:
			System.out.println(pin);
			break;
		case 1212:
			System.out.println(pin);
			break;	
		default:
			System.out.println("Invalid PIN");		
		}		
	}
}
