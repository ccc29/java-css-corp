
abstract class Sbi {
	abstract void  display();
	abstract void getRateOfInterest();
}
public class Bank extends Sbi{
	void display() {
		System.out.println("Abstract method implementation.");
	}
	void getRateOfInterest() {
		System.out.println("The rate of interest is: ");
	}
	public static void main (String[] args) {
		Bank s = new Bank();
		
		System.out.println("Rate of interest in SBI is 00");
		
	}
}
	